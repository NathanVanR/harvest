package za.co.harvest.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderItem {
    private UUID sellerId;
    private UUID productId;
    private Integer quantity;
    private Double unitPriceAtPurchase;
}
