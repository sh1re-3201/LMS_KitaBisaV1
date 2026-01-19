package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mata_pelajaran")
@Getter
@Setter
@NoArgsConstructor
public class MataPelajaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mapel;

    @Column(nullable = false)
    private String nama_mapel;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Guru id_guru;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Kelas id_kelas;

}
