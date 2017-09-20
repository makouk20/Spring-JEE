package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.Fournisseur;
import com.csys.myproject.dto.FournisseurDTO;

public class FournisseurFactory {

	public static Fournisseur fournisseurDTOToFournisseur(FournisseurDTO fournisseurDTO) {
		Fournisseur fournisseur = new Fournisseur();
		fournisseur.setIdFournisseur(fournisseurDTO.getId());
		fournisseur.setNomFournisseur(fournisseurDTO.getNomFournisseur());
		return fournisseur;
	}
	
	
	public static FournisseurDTO fournisseurToFournisseurDTO(Fournisseur fournisseur) {
		if(fournisseur !=null) {
		FournisseurDTO fournisseurDTO = new FournisseurDTO();
		fournisseurDTO.setId(fournisseur.getIdFournisseur());
		fournisseurDTO.setNomFournisseur(fournisseur.getNomFournisseur());
		
		return fournisseurDTO;
		} else return null ;
	}
	

	public static Collection<FournisseurDTO> fournisseursToFournisseurDTOs(List<Fournisseur> fournisseurs){
		List<FournisseurDTO> FournisseurDTOs = new ArrayList<>();
		for (Fournisseur fournisseur : fournisseurs) {
			FournisseurDTO fournisseurDTO = fournisseurToFournisseurDTO(fournisseur);
			FournisseurDTOs.add(fournisseurDTO);
		}
		return FournisseurDTOs ;
	}
	
}
