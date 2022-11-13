package com.esprit.tn.test.controller;

import com.esprit.tn.test.model.Etudiant;
import com.esprit.tn.test.service.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controllers {

    @Autowired
    IServices services;

    @PostMapping("/addEtudiants")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> listE){
        return services.addEtudiants(listE);
    }




}
