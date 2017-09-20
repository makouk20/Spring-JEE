package com.csys.myproject.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idArticle;
	private String designation;
	private double tva;
	private double prix;
	
	@OneToMany(mappedBy = "article")
	private Collection<LigneCommande> ligneCommandes;
	
	
	public long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	

}
