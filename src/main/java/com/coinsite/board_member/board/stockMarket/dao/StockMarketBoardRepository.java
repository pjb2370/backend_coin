package com.coinsite.board_member.board.stockMarket.dao;

import com.coinsite.board_member.board.stockMarket.domain.StockMarketBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMarketBoardRepository extends JpaRepository<StockMarketBoard, Integer> {
}
