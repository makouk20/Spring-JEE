package com.csys.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.myproject.domain.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
