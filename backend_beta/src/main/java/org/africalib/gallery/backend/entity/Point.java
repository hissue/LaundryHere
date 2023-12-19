package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pointNum;
    private String pointCategory;
    private String pointState;
    private int pointContent;
    private LocalDate pointDate;
}
