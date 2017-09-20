package com.csys.myproject.dto;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ArticleDTO {
    private long id ;
	private double prix;
	private double tva;
	private String designation ;
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	private Collection <LigneCommandeDTO> ligneCommandes ;

	public double getPrix() {
		return prix;
	}

	public Collection<LigneCommandeDTO> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(Collection<LigneCommandeDTO> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

}
