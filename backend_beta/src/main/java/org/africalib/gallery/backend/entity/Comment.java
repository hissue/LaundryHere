package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cmtNum;
    private String cmtTitle;
    private String cmtContent;
    private String cmtState;
    private String cmtCategory;
    private LocalDate cmtDate;
    private Byte cmtFile;
}
