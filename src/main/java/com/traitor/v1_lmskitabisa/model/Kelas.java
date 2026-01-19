package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "kelas")
@Getter
@Setter
@NoArgsConstructor
public class Kelas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_kelas;

    @Column(nullable = false)
    private String nama_kelas;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Guru id_wali_kelas;

}
