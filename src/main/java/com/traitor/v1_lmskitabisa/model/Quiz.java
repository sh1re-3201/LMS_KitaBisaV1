package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Table(name = "quiz")
@Getter
@Setter
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_quiz;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private MataPelajaran id_mapel;

    @Column(unique = true, nullable = false)
    private String judul;

    @Column(nullable = false)
    private double total_nilai;

    @Column(nullable = false)
    private LocalDateTime waktu_mulai;

    @Column(nullable = false)
    private LocalDateTime waktu_selesai;

    @Column(nullable = false)
    private int durasi_menit;

    @Column(nullable = false)
    private int max_attempts;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ScoringPolicy scoring_policy;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusQuiz status;

    public enum StatusQuiz{
        DRAFT,
        PUBLISHED,
        CLOSED
    }

    public enum ScoringPolicy{
        LAST_ATTEMPT,
        BEST_ATTEMPT
    }

}
