package za.co.harvest.service;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import za.co.harvest.entity.Product;
import za.co.harvest.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Mono<Product> addProduct(@NonNull Product product) {
        return productRepository.save(product);
    }
}
