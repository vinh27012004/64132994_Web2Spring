package thigk.ntu64132994.phamnguyentrivinh_fitcms.controllers;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Page;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Post;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.services.PageService;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.services.PostService;


@Controller
public class DashboardController {

    private final PageService pageService;
    private final PostService postService;

    public DashboardController(PageService pageService, PostService postService) {
        this.pageService = pageService;
        this.postService = postService;
    }

    @GetMapping({"/", "/dashboard"})
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/page/all")
    public String pageAll(ModelMap m) {
        m.addAttribute("dsTrang", pageService.getAllPages());
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

        List<Page> pages = pageService.getAllPages();
        int newId = pages.stream()
                .map(Page::getId)
                .max(Comparator.naturalOrder())
                .orElse(0) + 1;

        pageService.savePage(new Page(newId, pageName, keyword, content, parentPageId));
        return "redirect:/page/all";
    }

    @GetMapping("/page/view/{id}")
    public String pageView(@PathVariable("id") int id, ModelMap m) {
        Page page = pageService.getPageById(id);

        if (page == null) {
            return "redirect:/page/all";
        }

        m.addAttribute("page", page);
        return "page-view";
    }

    @GetMapping("/page/delete/{id}")
    public String pageDelete(@PathVariable("id") int id) {
        pageService.deletePageById(id);
        return "redirect:/page/all";
    }

    @GetMapping("/post/all")
    public String postAll(ModelMap m) {
        m.addAttribute("dsBaiViet", postService.getAllPosts());
        return "post-all";
    }

    @GetMapping({"/post/addnew", "/post/new"})
    public String postAddNew() {
        return "post-addnew";
    }

    @PostMapping({"/post/addnew", "/post/new"})
    public String postCreate(
            @RequestParam("title") String title,
            @RequestParam(value = "content", required = false, defaultValue = "") String content,
            @RequestParam(value = "categoryId", required = false, defaultValue = "0") int categoryId) {

        List<Post> posts = postService.getAllPosts();
        int newId = posts.stream()
                .map(Post::getId)
                .max(Comparator.naturalOrder())
                .orElse(0) + 1;

        postService.savePost(new Post(newId, title, content, categoryId));
        return "redirect:/post/all";
    }

    @GetMapping("/post/view/{id}")
    public String postView(@PathVariable("id") int id, ModelMap m) {
        Post post = postService.getPostById(id);

        if (post == null) {
            return "redirect:/post/all";
        }

        m.addAttribute("post", post);
        return "post-view";
    }

    @GetMapping("/post/delete/{id}")
    public String postDelete(@PathVariable("id") int id) {
        postService.deletePostById(id);
        return "redirect:/post/all";
    }
}
