package za.co.harvest.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.test.StepVerifier;
import za.co.harvest.entity.Product;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private WebClient webClient;

    @Test
    public void testAddProduct() {
        var inputProduct = new Product();
        inputProduct.setProductId(UUID.randomUUID().toString());
        inputProduct.setName("productName");
        inputProduct.setDescription("productDescription");
        inputProduct.setPrice(30d);
        var savedProductMono = webClient.post()
                .uri("/products")
                .bodyValue(inputProduct)
                .retrieve()
                .bodyToMono(Product.class);

        StepVerifier.create(savedProductMono)
                .assertNext(savedProduct -> {
                    assertNotNull(savedProduct);
                    assertEquals(inputProduct.getProductId(), savedProduct.getProductId());
                    assertEquals("productName", savedProduct.getName());
                    System.out.println("Inspected Product ID: " + savedProduct.getProductId());
                })
                .verifyComplete();
    }
}
