package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "presensi_header")
@Getter
@Setter
@NoArgsConstructor
public class PresensiHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_presensi_header;

    @ManyToOne
    @JoinColumn(nullable = false)
    private MataPelajaran id_mapel;

    @Column(nullable = false)
    private LocalDateTime tanggal_presensi;

    @Column(nullable = false)
    private LocalDateTime jam_mulai;

    @Column(nullable = false)
    private LocalDateTime jam_selesai;

    @Column(nullable = false)
    private boolean status_open;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Guru created_by;


}
