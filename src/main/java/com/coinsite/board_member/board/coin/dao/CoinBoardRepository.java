package com.coinsite.board_member.board.coin.dao;

import com.coinsite.board_member.board.coin.domain.CoinBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinBoardRepository extends JpaRepository<CoinBoard, Integer> {
}
