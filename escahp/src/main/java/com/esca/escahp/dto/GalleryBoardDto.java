package com.esca.escahp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GalleryBoardDto {
    // id
    private Long id;

    // 카테고리
    private String category;

    // 제목
    private String title;

    // 작성자
    private String writer;

    // 내용
    private String content;

    // 작성일자
    private LocalDateTime created_at;

    // 수정일자
    private LocalDateTime updated_at;

    // 삭제일자
    private LocalDateTime deleted_at;

    // 삭제여부
    private LocalDateTime deleted_yn;

    //조회수
    private int view;
}
