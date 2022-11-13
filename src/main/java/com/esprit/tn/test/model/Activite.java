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

public class Activite  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    Long idActivite ;

    @Column(name = "description")
    String description ;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    Date dataActivite ;

    @OneToOne(mappedBy = "activite")
    Endroit endroit ;





}
