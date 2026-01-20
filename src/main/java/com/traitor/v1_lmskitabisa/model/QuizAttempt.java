package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "quiz_attempt",
        uniqueConstraints = {
                @UniqueConstraint(
                     name =  "uq_quiz_attempt",
                        columnNames = {"id_quiz", "id_siswa", "attempt_number"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
public class QuizAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_attempt;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private Quiz id_quiz;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private Siswa id_siswa;

    @Column(nullable = false)
    private int attempt_number;

    @Column(nullable = false)
    private LocalDateTime start_time;

    @Column(nullable = false)
    private LocalDateTime end_time;

    @Column(nullable = false)
    private double total_score;

    @Column(nullable = false)
    private StatusQuizAttempt status;

    @Column(nullable = false)
    private boolean is_final;

    public enum StatusQuizAttempt{
        IN_PROGRESS,
        SUBMITTED,
        AUTO_SUBMITTED
    }
}
