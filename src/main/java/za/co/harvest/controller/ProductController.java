package za.co.harvest.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;
import za.co.harvest.entity.Product;
import org.springframework.web.bind.annotation.RestController;
import za.co.harvest.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Mono<Product> createProduct(@NonNull @RequestBody Product product) {
        return productService.addProduct(product);
    }
}
