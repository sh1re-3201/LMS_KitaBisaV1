package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "quiz_answer",
        uniqueConstraints = {
                @UniqueConstraint(
                        name =  "uq_attempt_question",
                        columnNames = {"id_attempt", "id_question"}
                )
        })
@Getter
@Setter
@NoArgsConstructor
public class QuizAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_answer;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private QuizAttempt id_attempt;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private QuizQuestion id_question;

    @Column(nullable = false)
    private String  answer_text;

    @Column(nullable = false)
    private double score;

    @Column(nullable = false)
    private boolean is_graded;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Guru graded_by;

    @Column(nullable = false)
    private LocalDateTime graded_at;
}
