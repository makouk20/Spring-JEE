package com.csys.myproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LigneCommandeDTO {

	private double montant ;
	private ArticleDTO articleDTO ;
	private int qte;
	private double prix ;
	private double tva ;
	private long  idCommande ;
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getTva() {
		return tva;
	}
	public long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	private CommandeDTO commandeDTO ;
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public ArticleDTO getArticle() {
		return articleDTO;
	}
	public void setArticle(ArticleDTO articleDTO) {
		this.articleDTO = articleDTO;
	}
	
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public CommandeDTO getCommande() {
		return commandeDTO;
	}
	public void setCommande(CommandeDTO commandeDTO) {
		this.commandeDTO = commandeDTO;
	}
	
	
	
}
