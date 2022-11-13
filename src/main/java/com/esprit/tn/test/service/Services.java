package com.esprit.tn.test.service;

import com.esprit.tn.test.model.Activite;
import com.esprit.tn.test.model.Club;
import com.esprit.tn.test.model.Etudiant;
import com.esprit.tn.test.repository.ClubRepository;
import com.esprit.tn.test.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Services implements IServices {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    ClubRepository clubRepository;


    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> listE) {
        return etudiantRepository.saveAll(listE);
    }


    @Override
    public Club addClub(Club club) {
        return clubRepository.save(club);

    }

    @Override
    public void affecterActiviteAuClub(Activite a, long idClub) {
        Club club = clubRepository.findById(idClub).get();
        club.getActivites().add(a);
        clubRepository.save(club);
    }
}


