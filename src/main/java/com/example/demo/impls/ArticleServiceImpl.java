package com.example.demo.impls;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.domains.ArticleDto;
import com.example.demo.repositories.ArticleRepository;
import com.example.demo.services.ArticleService;
import com.example.demo.utils.Printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    Printer printer;

    @Override
    public int write(ArticleDto article) {
        article.setRegDate(LocalDate.now().toString());
        printer.accept("서비스로 전송된 데이터: " + article.toString());
        return articleRepository.insert(article);
    }

    @Override
    public List<ArticleDto> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int crawling(String string) {
        // TODO Auto-generated method stub
        return 0;
    }
     
}