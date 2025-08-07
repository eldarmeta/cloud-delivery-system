package com.eldar.delivery.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String address;
    private String status;
}