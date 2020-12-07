package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Setter @Getter
public class ArticleDto {
    private String artNum, writerId, title, content, regDate ;
}
