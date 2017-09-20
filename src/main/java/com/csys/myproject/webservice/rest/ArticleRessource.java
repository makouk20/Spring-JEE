package com.csys.myproject.webservice.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csys.myproject.dto.ArticleDTO;
import com.csys.myproject.service.ArticleService;
import com.csys.myproject.util.RestPreconditions;

@RestController
@RequestMapping("/api/articles")
public class ArticleRessource {
	
	@Autowired
	ArticleService articleService ;
	private static final String ENTITY_NAME = "Article";
	
	@GetMapping
	public Collection<ArticleDTO> findAll() {
		return articleService.findAll();
	}
	@GetMapping("/{id}")
	public ArticleDTO findOne(@PathVariable Integer id) {
		ArticleDTO articleDTO = articleService.findOne(id);
		RestPreconditions.checkFound(articleDTO, ENTITY_NAME + "   Not Found");
		return articleService.findOne(id);

	}


}
