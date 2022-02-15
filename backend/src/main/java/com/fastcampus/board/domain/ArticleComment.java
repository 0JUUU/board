package com.fastcampus.board.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class ArticleComment {

    private Long id;

    private Long articleId;
    private String content;

    private LocalDateTime createdAt;
    @Setter private String createdBy;
    private LocalDateTime modifiedAt;
    @Setter private String modifiedBy;

    public ArticleComment(Long articleId, String content, String createdBy) {
        this.articleId = articleId;
        this.content = content;
        this.createdBy = createdBy;
        this.modifiedBy = createdBy;
    }
}
