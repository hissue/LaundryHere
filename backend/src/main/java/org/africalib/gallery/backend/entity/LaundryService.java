package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "LaundryService")
public class LaundryService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Num;
    private String launSProd;
    private String launReq;
    private String launSType;
    private String launSState;
    private int launAddPay;
}
