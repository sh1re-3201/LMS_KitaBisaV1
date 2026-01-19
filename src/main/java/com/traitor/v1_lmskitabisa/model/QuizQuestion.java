package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "quiz_question")
@Getter
@Setter
@NoArgsConstructor
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_question;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private Quiz id_quiz;

    @Column(nullable = false)
    private String question_text;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuestionType question_type;

    @Column(nullable = false)
    private float bobot_soal;

    @Column(nullable = false)
    private boolean is_auto_graded;

    @Column(nullable = false)
    private int question_order;

    public enum QuestionType{
        TRUE_FALSE,
        SINGLE_CHOICE,
        MULTIPLE_CHOICE,
        SHORT_TEXT,
        PARAGRAPH,
        FILL_BLANK,
        FORMULA
    }
}
