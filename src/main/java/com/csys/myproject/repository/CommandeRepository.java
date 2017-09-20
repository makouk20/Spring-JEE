package com.csys.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.myproject.domain.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}
