package com.csys.myproject.factory;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.Commande;
import com.csys.myproject.domain.LigneCommande;
import com.csys.myproject.dto.CommandeDTO;
import com.csys.myproject.dto.LigneCommandeDTO;

public class CommandeFactory {
	public static Commande commandeDTOToCommande(CommandeDTO commandeDTO) {

		Commande commande = new Commande();
	    commande.setIdCommande(commandeDTO.getIdCommande());
	    commande.setDate(commandeDTO.getDate());
		
		Collection<LigneCommande> ligneCommandes = new ArrayList<>();
		for(LigneCommandeDTO ligneCommandeDTO :commandeDTO.getLigneCommandes()) {
		   
			LigneCommande ligneCommande = LigneCommandeFactory.ligneCommandeDTOToLigneCommande(ligneCommandeDTO);
			ligneCommandes.add(ligneCommande);
			ligneCommande.setCommande(commande);
		}
		commande.setLignesCommande(ligneCommandes);
	    
		
		return commande ;
	}
	
	
	
	public static CommandeDTO commandeToCommandeDTO(Commande commande) {

		if(commande !=null) {
		CommandeDTO commandeDTO = new CommandeDTO();
		commandeDTO.setIdCommande(commande.getIdCommande());
		commandeDTO.setDate(commande.getDate());
        commandeDTO.setLigneCommandes(LigneCommandeFactory.ligneCommandeToLigneCommandeDTOs(commande.getLignesCommande()));
        commandeDTO.setFournisseur(FournisseurFactory.fournisseurToFournisseurDTO(commande.getFournisseur()));
        
        return commandeDTO;
		}
	
		else return null ;
		}

	
	
	public static Collection<CommandeDTO> CommandeToCommandeDTOs(List<Commande> commandes) {
		List<CommandeDTO> CommandeDTOs = new ArrayList<>();
		for (Commande Commande : commandes) {
			CommandeDTO CommandeDTO = commandeToCommandeDTO(Commande);
			CommandeDTOs.add(CommandeDTO);
		}
		return CommandeDTOs;

	}
	
}
