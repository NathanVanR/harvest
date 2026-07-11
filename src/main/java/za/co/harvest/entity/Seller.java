package za.co.harvest.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Seller {
    private UUID sellerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
