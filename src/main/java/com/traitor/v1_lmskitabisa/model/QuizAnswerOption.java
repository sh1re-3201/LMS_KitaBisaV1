package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "quiz_answer_option")
@Getter
@Setter
@NoArgsConstructor
public class QuizAnswerOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_answer_option;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private QuizAnswer id_answer;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
        private QuizOption id_option;
}
