package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.csys.myproject.domain.LigneCommande;
import com.csys.myproject.dto.LigneCommandeDTO;

public class LigneCommandeFactory {

	public static LigneCommandeDTO ligneCommandeTOLigneCommandeDTO(LigneCommande ligneCommande) {
		if (ligneCommande != null) {
			LigneCommandeDTO ligneCommandeDTO = new LigneCommandeDTO();
			ligneCommandeDTO.setQte(ligneCommande.getQte());
			ligneCommandeDTO.setMontant(ligneCommande.getPrix() * ligneCommande.getQte() - ligneCommande.getTva());
			ligneCommandeDTO.setPrix(ligneCommande.getPrix());
			ligneCommandeDTO.setTva(ligneCommande.getTva());
			ligneCommandeDTO.setIdCommande(ligneCommande.getCommande().getIdCommande());
			ligneCommandeDTO.setArticle(ArticleFactory.articleToArticleDTO(ligneCommande.getArticle()));
			return ligneCommandeDTO;
		} else {
			return null;
		}
	}

	public static LigneCommande ligneCommandeDTOToLigneCommande(LigneCommandeDTO ligneCommandeDTO) {

		LigneCommande ligneCommande = new LigneCommande();
		ligneCommande.setPrix(ligneCommandeDTO.getPrix());
		ligneCommande.setTva(ligneCommandeDTO.getTva());
		ligneCommande.setQte(ligneCommandeDTO.getQte());
		return ligneCommande;
	}

	public static Collection<LigneCommandeDTO> ligneCommandeToLigneCommandeDTOs(Collection<LigneCommande> collection) {
		List<LigneCommandeDTO> ligneCommandeDTOs = new ArrayList<>();
		for (LigneCommande ligneCommande : collection) {
			LigneCommandeDTO LigneCommandeDTO = ligneCommandeTOLigneCommandeDTO(ligneCommande);
			ligneCommandeDTOs.add(LigneCommandeDTO);
		}
		return ligneCommandeDTOs;

	}

}