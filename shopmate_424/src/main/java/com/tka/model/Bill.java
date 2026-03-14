package com.tka.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;

    private long totalAmount;

    private Date billDate = new Date();

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

}