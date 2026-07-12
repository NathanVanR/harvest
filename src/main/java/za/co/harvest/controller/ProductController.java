package za.co.harvest.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import za.co.harvest.entity.Product;
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

    @GetMapping("/products")
    public Flux<Product> getAllProducts() {
        return  null;
    }
}
