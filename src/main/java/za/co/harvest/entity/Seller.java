package za.co.harvest.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Seller {
    private String sellerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
