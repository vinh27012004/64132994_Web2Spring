package thigk1.phamnguyentrivinh.dethigiuaki_de2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Product;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory_CategoryId(Long categoryId);
}
