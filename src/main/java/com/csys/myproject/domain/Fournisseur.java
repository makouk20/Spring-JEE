package com.csys.myproject.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Fournisseur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idFournisseur ;
	String nomFournisseur ;
	
	@JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "fournisseur", fetch = FetchType.EAGER,orphanRemoval = true)
    private Collection<Commande> commandes;
	
	public Integer getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur( Integer idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

}
