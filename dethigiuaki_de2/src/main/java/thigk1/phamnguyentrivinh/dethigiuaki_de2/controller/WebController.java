package thigk1.phamnguyentrivinh.dethigiuaki_de2.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Category;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Product;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.User;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.service.CategoryService;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.service.ProductService;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.service.UserService;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               HttpSession session,
                               Model model) {
        User user = userService.login(username, password);
        if (user != null) {
            session.setAttribute("loggedInUser", user);
            return "redirect:/";
        } else {
            model.appendAttribute("error", "Sai tên đăng nhập hoặc mật khẩu");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        if (session.getAttribute("loggedInUser") == null) {
            return "redirect:/login";
        }
        List<Product> products = productService.getAllProducts();
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        return "index";
    }

    @GetMapping("/category/{id}")
    public String productsByCategory(@PathVariable Long id, Model model, HttpSession session) {
        if (session.getAttribute("loggedInUser") == null) {
            return "redirect:/login";
        }
        List<Product> products = productService.getProductsByCategoryId(id);
        List<Category> categories = categoryService.getAllCategories();
        Optional<Category> currentCategory = categoryService.getCategoryById(id);

        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        currentCategory.ifPresent(category -> model.addAttribute("currentCategory", category));

        return "products-by-category";
    }

    @GetMapping("/product/{id}")
    public String productDetail(@PathVariable Long id, Model model, HttpSession session) {
        if (session.getAttribute("loggedInUser") == null) {
            return "redirect:/login";
        }
        Optional<Product> product = productService.getProductById(id);
        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return "product-detail";
        } else {
            return "redirect:/";
        }
    }
}
