package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.Article;
import com.csys.myproject.domain.LigneCommande;
import com.csys.myproject.dto.ArticleDTO;
import com.csys.myproject.dto.LigneCommandeDTO;

public class ArticleFactory {

	public static ArticleDTO articleToArticleDTO(Article article) {

		if (article != null) {
			
			ArticleDTO articleDTO = new ArticleDTO();
			articleDTO.setId(article.getIdArticle());
			articleDTO.setPrix(article.getPrix());
			articleDTO.setTva(article.getTva());
			articleDTO.setDesignation(article.getDesignation());
			return articleDTO;
		}

		return null;

	}
	
	public static Article ArticleDTOToArticle (ArticleDTO articleDTO) {
		Article article = new Article();
		article.setIdArticle(articleDTO.getId());
		article.setPrix(articleDTO.getPrix());
		article.setTva(articleDTO.getTva());
		Collection<LigneCommande> ligneCommandes = new ArrayList<>();
		for(LigneCommandeDTO ligneCommandeDTO:articleDTO.getLigneCommandes()) {
			LigneCommande ligneCommande =LigneCommandeFactory.ligneCommandeDTOToLigneCommande(ligneCommandeDTO);
			ligneCommandes.add(ligneCommande);
			ligneCommande.setArticle(article);
		}
		article.setLigneCommandes(ligneCommandes);

		
		return article ;
		
	}
	
	public static Collection<ArticleDTO> ArticleToArticleDTOs(List<Article> articles) {
		List<ArticleDTO> ArticleDTOs = new ArrayList<>();
		for (Article article : articles) {
			ArticleDTO ArticleDTO = articleToArticleDTO(article);
			ArticleDTOs.add(ArticleDTO);
		}
		return ArticleDTOs;

	}
	
	
	
}
