package thigk.ntu64132994.phamnguyentrivinh_fitcms.contrellers;

import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Page;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Post;


@Controller
public class DashboardController {

    private final ArrayList<Page> dsTrang = new ArrayList<>();
    private final ArrayList<Post> dsBaiViet = new ArrayList<>();

    public DashboardController() {
        dsTrang.add(new Page(1, "Trang chu", "trang-chu", "Noi dung trang chu", 0, "home.png"));
        dsTrang.add(new Page(2, "Gioi thieu", "gioi-thieu", "Noi dung gioi thieu", 0, "about.png"));
        dsTrang.add(new Page(3, "Lien he", "lien-he", "Noi dung lien he", 1, "contact.png"));

        dsBaiViet.add(new Post(1, "Bai viet so 1", "Noi dung bai viet 1", 101, "post-1.png"));
        dsBaiViet.add(new Post(2, "Bai viet so 2", "Noi dung bai viet 2", 101, "post-2.png"));
        dsBaiViet.add(new Post(3, "Bai viet so 3", "Noi dung bai viet 3", 102, "post-3.png"));
    }

    @GetMapping({"/", "/dashboard"})
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/page/all")
    public String pageAll(ModelMap m) {
        m.addAttribute("dsTrang", dsTrang);
        return "page-all";
    }

    @GetMapping({"/page/addnew", "/page/new"})
    public String pageAddNew() {
        return "page-addnew";
    }

    @PostMapping({"/page/addnew", "/page/new"})
    public String pageCreate(
            @RequestParam("pageName") String pageName,
            @RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
            @RequestParam(value = "content", required = false, defaultValue = "") String content,
            @RequestParam(value = "parentPageId", required = false, defaultValue = "0") int parentPageId) {

        int newId = dsTrang.stream()
                .map(Page::getId)
                .max(Comparator.naturalOrder())
                .orElse(0) + 1;

        dsTrang.add(new Page(newId, pageName, keyword, content, parentPageId));
        return "redirect:/page/all";
    }

    @GetMapping("/page/view/{id}")
    public String pageView(@PathVariable("id") int id, ModelMap m) {
        Page page = dsTrang.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (page == null) {
            return "redirect:/page/all";
        }

        m.addAttribute("page", page);
        return "page-view";
    }

    @GetMapping("/page/delete/{id}")
    public String pageDelete(@PathVariable("id") int id) {
        dsTrang.removeIf(p -> p.getId() == id);
        return "redirect:/page/all";
    }

    @GetMapping("/post/all")
    public String postAll(ModelMap m) {
        m.addAttribute("dsBaiViet", dsBaiViet);
        return "post-all";
    }

    @GetMapping("/post/addnew")
    public String postAddNew() {
        return "post-addnew";
    }
}
