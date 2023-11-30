package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addrNum;
    private String getAddr;
    private String shipAddr;
    private String addrEnt;
    private String addrDetail;
}
