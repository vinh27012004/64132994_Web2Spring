package thigk1.phamnguyentrivinh.dethigiuaki_de2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Category;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Product;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.service.CategoryService;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/category/{id}")
    public List<Product> getProductsByCategory(@PathVariable Long id) {
        return productService.getProductsByCategoryId(id);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
