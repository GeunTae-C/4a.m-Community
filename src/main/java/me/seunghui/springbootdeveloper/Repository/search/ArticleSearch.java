package me.seunghui.springbootdeveloper.Repository.search;

import me.seunghui.springbootdeveloper.dto.ArticleListViewResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//게시글 목록을 조회할 때 필요한 검색 기능을 추상화한 인터페이스
public interface ArticleSearch {
    Page<ArticleListViewResponse> searchDTO(Pageable pageable);
}