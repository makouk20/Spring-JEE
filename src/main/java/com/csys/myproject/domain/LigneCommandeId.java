package com.csys.myproject.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class LigneCommandeId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idCommande;
	private long idArticle ;
	public LigneCommandeId() {
		
	}
	public long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande( long idCommande) {
		this.idCommande = idCommande;
	}
	public long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}

	public LigneCommandeId(long idCommande,long idArticle) {
		this.idCommande=idCommande;
		this.idArticle=idArticle;
	}
	
}
