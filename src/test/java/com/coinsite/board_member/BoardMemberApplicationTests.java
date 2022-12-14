package com.coinsite.board_member;

import com.coinsite.board_member.board.Inform.dao.InformBoardRepository;
import com.coinsite.board_member.board.Inform.domain.InformBoard;
import com.coinsite.board_member.board.coin.dao.CoinBoardRepository;
import com.coinsite.board_member.board.coin.domain.CoinBoard;
import com.coinsite.board_member.board.news.dao.NewsBoardRepository;
import com.coinsite.board_member.board.news.domain.NewsBoard;
import com.coinsite.board_member.board.stockMarket.dao.StockMarketBoardRepository;
import com.coinsite.board_member.board.stockMarket.domain.StockMarketBoard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardMemberApplicationTests {
	@Autowired
	private CoinBoardRepository coinBoardRepository;
	@Autowired
	private InformBoardRepository informBoardRepository;
	@Autowired
	private NewsBoardRepository newsBoardRepository;
	@Autowired
	private StockMarketBoardRepository stockMarketBoardRepository;

	@Test
	void contextLoads() {
		for(int i = 1; i<=10; i++){
			CoinBoard c1 = new CoinBoard();
			InformBoard i1 = new InformBoard();
			NewsBoard n1 = new NewsBoard();
			StockMarketBoard sm1 = new StockMarketBoard();
			String subject;
			String contents;
			// Coin Board (코인게시판) 테스트 케이스 추가 코드
			subject = i + "번째 코인 게시글 제목";
			contents = i + "번째 코인 게시글 내용";
			c1.setSubject(subject);
			c1.setContents(contents);
			this.coinBoardRepository.save(c1);
			System.out.println(i + "번째 코인 게시판 테스트 데이터가 성공적으로 저장되었습니다.");

			// Inform Board (공지사항 게시판) 테스트 케이스 추가 코드
			subject = i + "번째 공지사항 게시글 제목";
			contents = i + "번째 공지사항 게시글 내용";
			i1.setSubject(subject);
			i1.setContents(contents);
			this.informBoardRepository.save(i1);
			System.out.println(i + "번째 공지사항 게시판 테스트 데이터가 성공적으로 저장되었습니다.");

			// News Board (뉴스 게시판) 테스트 케이스 추가 코드
			subject = i + "번째 뉴스 게시글 제목";
			contents = i + "번째 뉴스 게시글 내용";
			n1.setSubject(subject);
			n1.setContents(contents);
			this.newsBoardRepository.save(n1);
			System.out.println(i + "번째 뉴스 게시판 테스트 데이터가 성공적으로 저장되었습니다.");

			// StockMarket Board (주식 게시판) 테스트 케이스 추가 코드
			subject = i + "번째 주식 게시글 제목";
			contents = i + "번째 주식 게시글 내용";
			sm1.setSubject(subject);
			sm1.setContents(contents);
			this.stockMarketBoardRepository.save(sm1);
			System.out.println(i + "번째 주식 게시판 테스트 데이터가 성공적으로 저장되었습니다.");
		}
	}
}
