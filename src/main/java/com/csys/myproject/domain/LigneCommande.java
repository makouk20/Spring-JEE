package com.csys.myproject.domain;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {

	private LigneCommandeId ligneCommandeId;
	private int qte;
	private Commande commande;
	private Article article;
	private double montant;
	private double prix;
	private double tva;

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

	public LigneCommande() {
	}

	@EmbeddedId
	public LigneCommandeId getLigneCommandeId() {
		return ligneCommandeId;
	}

	public void setLigneCommandeId(LigneCommandeId ligneCommandeId) {
		this.ligneCommandeId = ligneCommandeId;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	@ManyToOne
	@JoinColumn(name = "idCommande", referencedColumnName = "idCommande", insertable = false, updatable = false)
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@ManyToOne
	@JoinColumn(name = "idArticle", referencedColumnName = "idArticle", insertable = false, updatable = false)
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

}
