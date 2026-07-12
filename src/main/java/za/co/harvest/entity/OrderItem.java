package za.co.harvest.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderItem {
    private String sellerId;
    private String productId;
    private Integer quantity;
    private Double unitPriceAtPurchase;
}
