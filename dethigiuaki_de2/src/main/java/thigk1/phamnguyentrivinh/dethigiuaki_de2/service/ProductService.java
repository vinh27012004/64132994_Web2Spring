package thigk1.phamnguyentrivinh.dethigiuaki_de2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.entity.Product;
import thigk1.phamnguyentrivinh.dethigiuaki_de2.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategoryId(Long categoryId) {
        return productRepository.findByCategory_CategoryId(categoryId);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
}
