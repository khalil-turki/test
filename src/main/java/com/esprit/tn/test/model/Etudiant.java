package com.esprit.tn.test.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;

    @Column(name = "nom")
    String nomEtudiant;

    @Column(name = "prenom")
    String prenomEtudiant;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    Date dateNaissance;

    @Enumerated(EnumType.STRING)
     Sexe sexe ;

    @ManyToMany
    List<Club> clubs ;

    @ManyToOne
    Club club ;


}


