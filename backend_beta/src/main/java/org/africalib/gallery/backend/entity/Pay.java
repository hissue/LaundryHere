package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Pay")
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payNum;
    private LocalDate payDate;
    private int payMoney;
}
