package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "presensi_detail",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_presensi_header_siswa",
                        columnNames = {"id_presensi_header", "id_siswa"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
public class PresensiDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_presensi_detail;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private PresensiHeader id_presensi_header;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private Siswa id_siswa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusKehadiran status_kehadiran;

    @Column(nullable = false)
    private LocalDateTime waktu_presensi;

    public enum StatusKehadiran {
        HADIR,
        IZIN,
        SAKIT,
        ALPHA
    }
}
