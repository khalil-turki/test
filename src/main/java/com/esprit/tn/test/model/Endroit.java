package com.esprit.tn.test.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class Endroit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     @Column(name = "id")
    Long idEndroit ;

    @Column(name = "nom")
    String nomEndroit ;

    @Column(name = "adresse")
    String adresseEndroit ;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    Date dateCreation ;

    @OneToOne
    Activite activite ;






}
