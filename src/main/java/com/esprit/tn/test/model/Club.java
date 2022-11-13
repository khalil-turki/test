package com.esprit.tn.test.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

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

public class Club implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClub ;

    @Column(name = "nom")
    String nomClub ;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    Date dateCreation ;

    @Column(name = "nbMaxAdherents")
    Long nbMaxAdherents ;

    @OneToMany(cascade=CascadeType.ALL)
    List<Activite> activites ;

    @ManyToMany(mappedBy = "clubs")
    List<Etudiant> etudiants ;

    @OneToMany(mappedBy = "club")
    List<Etudiant>etudiantss;






}
