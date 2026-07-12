package za.co.harvest.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Buyer {
    private String buyerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
