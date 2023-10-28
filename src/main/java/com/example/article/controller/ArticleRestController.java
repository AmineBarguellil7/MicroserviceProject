package com.example.article.controller;


import com.example.article.entity.Article;
import com.example.article.repos.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleRestController {


    @Autowired
    ArticleRepository articleRepository;


    @PostMapping("/addArticle")
    public Article addArticle(@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @GetMapping("")
    public List<Article> ListArticles () {
        return articleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Article ArticleById (@PathVariable Integer id) {
        return articleRepository.findById(id).orElse(null);
    }


    @PutMapping("/updateArticle")
    public Article updateArticle(@RequestBody Article article) {
        return articleRepository.save(article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle (@PathVariable Integer id) {
        if (articleRepository.findById(id).isPresent())
            articleRepository.deleteById(id);
    }



    @GetMapping("/hello")
    public void display () {
        System.out.println("Hello");
    }




}
