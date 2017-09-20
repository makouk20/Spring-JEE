package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.LigneCommande;
import com.csys.myproject.dto.LigneCommandeDTO;
import com.csys.myproject.factory.LigneCommandeFactory;
import com.csys.myproject.repository.LigneCommandeRepository;

@Service
@Transactional
public class LigneCommandeService {
	
	@Autowired
	LigneCommandeRepository ligneCommandeRepository;

	@Transactional(readOnly = true)
	public LigneCommandeDTO findOne(Integer id) {
		LigneCommande ligneCommande = ligneCommandeRepository.findOne(id);
		return LigneCommandeFactory.ligneCommandeTOLigneCommandeDTO(ligneCommande);
	}
	@Transactional(readOnly = true)
	public Collection<LigneCommandeDTO> findAll() {
		List<LigneCommande> result =ligneCommandeRepository.findAll();
		return LigneCommandeFactory.ligneCommandeToLigneCommandeDTOs(result);
	}
	
}
