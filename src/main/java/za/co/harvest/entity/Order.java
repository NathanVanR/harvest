package za.co.harvest.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class Order {
    private String orderId;
    private String buyerId;
    private LocalDateTime orderDate;
    private List<OrderItem> orderItems;
    private Double totalPrice;

}
