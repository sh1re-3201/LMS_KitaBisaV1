package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

@Entity
@Table(name = "admin")
@Getter
@Setter
@NoArgsConstructor
public class Admin {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

// katanya pake ini
    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private User user;

    @Column(unique = true, nullable = false)
    private String kode_admin;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nama_lengkap;

}
