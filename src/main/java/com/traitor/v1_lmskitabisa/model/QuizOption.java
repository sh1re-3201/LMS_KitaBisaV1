package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "quiz_option")
@Getter
@Setter
@NoArgsConstructor
public class QuizOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_option;

    @ManyToOne
    @JoinColumn(unique = true, nullable = false)
    private QuizQuestion id_question;

    @Column(nullable = false)
    private String option_text;

    @Column(nullable = false)
    private boolean is_correct;

    @Column(nullable = false)
    private int option_order;



}
