package com.csys.myproject.dto;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FournisseurDTO {

	private Integer id ;
	String nomFournisseur ;
	 Collection<CommandeDTO> commandesDTO ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	public Collection<CommandeDTO> getCommandesDTO() {
		return commandesDTO;
	}
	public void setCommandesDTO(Collection<CommandeDTO> commandesDTO) {
		this.commandesDTO = commandesDTO;
	}
	
}
