package org.africalib.gallery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memNum;
    @Column(length = 50,nullable = false, unique = true)
    private String memEmail;
    private String memPwd;
    private String memName;
    private String memPhone;
    private String memState;
    private int memPoint;
    private LocalDate memDate;
}
