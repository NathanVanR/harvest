package za.co.harvest.entity;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import lombok.Data;

import java.util.UUID;

@Data
@Document(collectionName = "products")
public class Product {
    @DocumentId
    private UUID productId;
    private String name;
    private String description;
    private Double price;
}
