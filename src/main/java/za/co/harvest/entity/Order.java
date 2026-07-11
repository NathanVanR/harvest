package za.co.harvest.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class Order {
    private UUID orderId;
    private UUID buyerId;
    private LocalDateTime orderDate;
    private List<OrderItem> orderItems;
    private Double totalPrice;

}
