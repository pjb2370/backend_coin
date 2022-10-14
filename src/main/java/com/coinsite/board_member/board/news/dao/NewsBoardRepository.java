package com.coinsite.board_member.board.news.dao;


import com.coinsite.board_member.board.news.domain.NewsBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsBoardRepository extends JpaRepository<NewsBoard, Integer> {
}
