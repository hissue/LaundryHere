package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNum;
    private int orderCnt;
    private int orderPay;
    private String orderState;
    private String orderComment;
    private LocalDate orderDate;
    private LocalDate orderEndDate;
    private Byte orderPicture;

}
