package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "Board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNum;
    private String boardType;
    private String boardTitle;
    private String boardContent;
    private LocalDate boardDelDate;
    private LocalDate boardInsDate;
    private LocalDate boardUpDate;
}
