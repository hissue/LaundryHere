package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemNum;
    @Column(length = 50,nullable = false)
    private String itemName;
    @Column(length = 100)
    private String itemAmount;

}
