package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.Article;
import com.csys.myproject.dto.ArticleDTO;
import com.csys.myproject.factory.ArticleFactory;
import com.csys.myproject.repository.ArticleRepository;

@Service
@Transactional
public class ArticleService {
	
	@Autowired
	ArticleRepository articleRepository ;
	
	@Transactional(readOnly = true)
	public ArticleDTO findOne(Integer id) {
		Article article = articleRepository.findOne(id);
		return ArticleFactory.articleToArticleDTO(article);
	}
	@Transactional(readOnly = true)
	public Collection<ArticleDTO> findAll() {
		List<Article> result =articleRepository.findAll();
		return ArticleFactory.ArticleToArticleDTOs(result);
	}

}
