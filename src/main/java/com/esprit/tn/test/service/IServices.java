package com.esprit.tn.test.service;

import com.esprit.tn.test.model.Activite;
import com.esprit.tn.test.model.Club;
import com.esprit.tn.test.model.Etudiant;

import java.util.List;

public interface IServices {
    List<Etudiant> addEtudiants(List<Etudiant> listE);

    Club addClub(Club club);

    void affecterActiviteAuClub(Activite a, long idClub);

}
