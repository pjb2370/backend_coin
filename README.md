# stockSiteBackend

# Rest Api url종류
<h3> /board/"value"/ </h1>

  1. 게시판 설명
	
  	value에 원하는 게시판명을 입력합니다.
  	현재 구현되어있는 게시판은 다음과 같이 4개입니다.
	
    1-1.coin
      (코인게시판)
    1-2.inform
      (공지사항 게시판)
    1-3.news
      (뉴스게시판)
    1-4.stockmarket
      (주식 게시판)
    
  2. 게시판별 api 기능설명
	
  	각 게시판은 공통적으로 post와 get api를 지원합니다.
  	예시 : localhost:8082/board/coin/get, localhost:8082/board/coin/post
         
  2-1 get메소드 설명
	
  	get 메소드는 파라메타를 입력받지 않습니다.
  	get 메소드는 게시판의 전체목록을 json으로 반환합니다.
  
  2-2 post 메소드 설명
	
  	post 메소드는 다음과 같은 파라메타를 입력하여야합니다.
	1. String 타입의 Subject(200자 제한)
	2. String 타입의 Contents
  	post 메소드는 데이터 저장에 성공했을 시, String타입의 "성공적으로 저장되었습니다." 메세지를 반환합니다.
