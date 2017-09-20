package com.csys.myproject.webservice.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csys.myproject.dto.LigneCommandeDTO;
import com.csys.myproject.service.LigneCommandeService;
import com.csys.myproject.util.RestPreconditions;

@RestController
@RequestMapping("/api/ligneCommandes")
public class LigneCommandeRessource {
	
	@Autowired
	LigneCommandeService ligneCommandeService;
	private static final String ENTITY_NAME = "LigneCommande";

	@GetMapping
	public Collection<LigneCommandeDTO> findAll() {
		return ligneCommandeService.findAll();
	}
	@GetMapping("/{id}")
	public LigneCommandeDTO findOne(@PathVariable Integer id) {
		LigneCommandeDTO ligneCommandeDTO = ligneCommandeService.findOne(id);
		RestPreconditions.checkFound(ligneCommandeDTO, ENTITY_NAME + "   Not Found");
		return ligneCommandeService.findOne(id);

	}

}
