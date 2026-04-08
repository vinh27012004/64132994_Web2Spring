package thigk.ntu64132994.phamnguyentrivinh_fitcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Post;
import thigk.ntu64132994.phamnguyentrivinh_fitcms.repositories.PostRepository;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePostById(int id) {
        postRepository.deleteById(id);
    }
}