package com.JumpToSpringBoots.JumpToSpringBoots.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne // 사용자 한 명이 질문 여러 개 작성 가능
    private SiteUser author; // 글작성자

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter; // 추천 기능
}
