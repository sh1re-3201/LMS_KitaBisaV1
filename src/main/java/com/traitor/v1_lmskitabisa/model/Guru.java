package com.traitor.v1_lmskitabisa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "guru")
@Getter
@Setter
@NoArgsConstructor
public class Guru {
    @Id
    @Column(name = "id_user")
    private Long id_user;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private User user;

    @Column(unique = true, nullable = false)
    private String nip;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false)
    private String nama_lengkap;

}
