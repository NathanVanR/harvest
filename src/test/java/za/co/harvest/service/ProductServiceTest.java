//package za.co.harvest.service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import reactor.test.StepVerifier;
//import za.co.harvest.entity.Product;
//import za.co.harvest.repository.ProductRepository;
//
//import java.util.UUID;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@Slf4j
//public class ProductServiceTest {
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private ProductService productService;
//
//    @Test
//    public void testCreateProduct() {
//        var inputProduct = new Product();
//        inputProduct.setProductId(UUID.randomUUID().toString());
//        inputProduct.setName("productName");
//        inputProduct.setDescription("productDescription");
//        inputProduct.setPrice(30d);
//        var monoProduct = productRepository.save(inputProduct);
//        StepVerifier.create(monoProduct)
//                .assertNext(savedProduct -> {
//                    assertEquals(inputProduct.getProductId(), savedProduct.getProductId());
//                    log.info("Saved product details: {}", savedProduct);
//                })
//                .verifyComplete();
//    }
//}
