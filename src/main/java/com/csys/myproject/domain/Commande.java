package com.csys.myproject.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCommande;
	private double montant;
	private Date date;
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "commande")
	private Collection<LigneCommande> lignesCommande;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;
	
	

	public Collection<LigneCommande> getLignesCommande() {
		return lignesCommande;
	}

	public void setLignesCommande(Collection<LigneCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}

	public long getIdArticle() {
		return idCommande;
	}

	public void setIdArticle( Integer idCommande) {
		this.idCommande = idCommande;
	}



	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
