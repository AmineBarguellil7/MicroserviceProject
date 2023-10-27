package com.example.avis.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "avis")
public class Avis {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idAvis;
    private Integer evaluation;
    private  String commentaire;
    @Temporal(TemporalType.DATE)
    private Date date_soumission_avis;
}
