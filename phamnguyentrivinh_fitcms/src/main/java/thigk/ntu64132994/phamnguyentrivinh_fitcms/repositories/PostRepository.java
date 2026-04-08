package thigk.ntu64132994.phamnguyentrivinh_fitcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thigk.ntu64132994.phamnguyentrivinh_fitcms.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}