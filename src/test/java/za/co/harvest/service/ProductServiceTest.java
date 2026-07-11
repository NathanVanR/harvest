package za.co.harvest.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import za.co.harvest.entity.Product;
import za.co.harvest.repository.ProductRepository;

import javax.annotation.meta.When;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testCreateProduct() {
        var inputProduct = new Product();
        inputProduct.setProductId(UUID.randomUUID());
        inputProduct.setName("productName");
        inputProduct.setDescription("productDescription");
        inputProduct.setPrice(30d);

        when(productRepository.save(inputProduct)).thenReturn(Mono.just(inputProduct));

        Mono<Product> result = productService.addProduct(inputProduct);

        StepVerifier.create(result)
                .assertNext(savedProduct -> {
                    assertEquals(inputProduct.getProductId(), savedProduct.getProductId());
                })
                .verifyComplete();
        verify(productRepository, times(1)).save(inputProduct);

    }
}
