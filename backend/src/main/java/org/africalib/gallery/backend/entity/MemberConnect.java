package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "MemberConnect")
public class MemberConnect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memConNum;
    private LocalDate memLastDate;
}
