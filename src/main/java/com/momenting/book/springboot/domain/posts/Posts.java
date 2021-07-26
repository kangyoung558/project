package com.momenting.book.springboot.domain.posts;

import com.momenting.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity // 테이블과 링크될 클래스임을 나타냄 테이블이름은 posts
public class Posts  extends BaseTimeEntity {

    @Id //해당 테이블의 PK필드가 될 녀셕에게 붙힌다.
    @GeneratedValue //PK생성 규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false)
    private  String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
