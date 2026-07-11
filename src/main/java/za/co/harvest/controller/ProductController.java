package za.co.harvest.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import za.co.harvest.entity.Product;
import org.springframework.web.bind.annotation.RestController;
import za.co.harvest.repository.ProductRepository;

@RestController
public class ProductController {




//    public ResponseEntity<Product> addProduct(@NonNull Product product) {
//        productRepository.save(product);
//        return ResponseEntity.ok().body(product);
//    }
}
