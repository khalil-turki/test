package com.esprit.tn.test.repository;

import com.esprit.tn.test.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club,Long > {




}

