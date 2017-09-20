package com.csys.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.myproject.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
