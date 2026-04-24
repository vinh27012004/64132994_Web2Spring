package thigk1.phamnguyentrivinh.dethigiuaki_de2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
