package thigk.ntu64132994.phamnguyentrivinh_fitcms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Post;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.services.PostService;

@RestController
@RequestMapping("/api/post")
public class ApiPostController {

    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") int id) {
        return postService.getPostById(id);
    }
}