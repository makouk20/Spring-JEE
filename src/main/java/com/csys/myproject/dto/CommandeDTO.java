package com.csys.myproject.dto;

import java.sql.Date;
import java.util.Collection;

import com.csys.myproject.domain.Fournisseur;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommandeDTO {

	private Integer idCommande ;
	private String fournisseurNom ;
	private Date date ;
	private double montant ;
	private FournisseurDTO fournisseur ;
	
	
	public FournisseurDTO getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(FournisseurDTO fournisseur) {
		this.fournisseur = fournisseur;
	}
	private Collection <LigneCommandeDTO> ligneCommandes ;
	public Integer getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}
	
	public String getFournisseurNom() {
		return fournisseurNom;
	}
	public void setFournisseurNom(String fournisseurNom) {
		this.fournisseurNom = fournisseurNom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Collection<LigneCommandeDTO> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(Collection<LigneCommandeDTO> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	

}
