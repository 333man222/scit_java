package board.ui;

import java.util.List;
import java.util.Scanner;
import board.service.BoardService;
import board.service.ReplyService;
import board.vo.Board;
import board.vo.Reply;

public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	BoardService boardService = new BoardService();
	ReplyService replyService = new ReplyService();
	
	public BoardUI() {
		String choice = null;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : 
				insertBoard();
				break;
			case "2" :
				selectAll();
				break;
			case "3" : 
				selectOne();
				break;
			case "4" :
				deleteBoard();
				break;
			case "5" :
				searchBoard();
				break;
			case "6" : 
				break;
			case "0" : 
				System.out.println("** 프로그램을 종료합니다");
				return;
			default : 
				System.out.println("** 메뉴를 다시 선택해주세요");
			}
		}
	}
	
	private void searchBoard() {
		subMenu();
		String choice = keyin.next();
		String searchItem = null;
		String searchWord = null;
		
		switch(choice) {
		case "1" : 
			searchItem="title"; break;
		case "2" : 
			searchItem="writer"; break;
		case "3" : 
			searchItem="textcontent"; break;
		case "0" :
			return;
		default : 
			System.out.println("** 메뉴 선택을 잘못했습니다.");
			return ;
		}
		
		System.out.print("> 검색 키워드 입력 : ");
		searchWord = keyin.next();

		List<Board> list = boardService.searchBoard(searchItem, searchWord);
		if(list == null) {
			System.out.println("** 검색된 정보가 없습니다.");
			return;
		}
		
		for(Board b : list)
			System.out.println(b);
	}
	
	/**
	 * 검색을 하기위한 서브메뉴 
	 */
	private void subMenu() {
		System.out.println("\n    [[ 글 검색 ]]");
		System.out.println("=======================");
		System.out.println("    1) 제목으로 검색");
		System.out.println("    2) 작성자로 검색");
		System.out.println("    3) 내용으로 검색");
		System.out.println("    0) 메인으로");
		System.out.println("=======================");
		System.out.print  ("       > 선택 : ");
		
	}
	/**
	 * 입력한 게시글번호 한개를 삭제
	 */
	private void deleteBoard() {
		System.out.println("\n    [[ 글 삭제 ]]");
		System.out.println("=======================");
		int board_seq;

		System.out.print("> 삭제할 글 번호 :");
		try {
			board_seq = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** 글 번호를 숫자로 입력하시오");
			keyin.nextLine();
			return;
		}
		
		int result = boardService.deleteBoard(board_seq);
		
		if(result == 0) {
			System.out.println("** 게시글이 존재하지 않아 삭제 실패.");
		} else {
			System.out.println("** 삭제 완료");	
		}
	}
	/**
	 * 글 한 개를 조회
	 * select * from board where board_seq = ?
	 */
	private void selectOne() {
		System.out.println("\n    [[ 글 읽기 ]]");
		System.out.println("=======================");
		int board_seq;

		System.out.print("> 글 번호 :");
		try {
			board_seq = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** 글 번호를 숫자로 입력하시오");
			keyin.nextLine();
			return;
		}
		
		Board board = boardService.selectOne(board_seq);
		
		if(board == null) {
			System.out.println("** 게시글이 존재하지 않습니다.");
			return;
		}
		System.out.println(board);
		
		List<Reply> listReply = replyService.selectAll(board_seq);

		if(listReply != null) {
			for(Reply r : listReply)
				System.out.println(r);
		}
		
		// 댓글 입력할건지 여부를 물어봄
		String answer = null;
		System.out.print(">> 댓글을 입력하시겠습니까?(Y/n) ");
		answer = keyin.next();
		
		if(!answer.equals("Y")) return;
		
		System.out.print(" >> 이름 : ");
		String writer = keyin.next();
		keyin.nextLine(); 
		
		System.out.print(" >> 댓글 내용 : ");
		String text = keyin.nextLine();
		
		Reply temp = new Reply(0, board_seq, writer, text, null);
		
		int result = replyService.insertReply(temp);
		if(result == 1) {
			System.out.println("** 댓글이 등록되었습니다.");
		} else {
			System.out.println("** 댓글 등록 실패");
		}
		
		
	}
	/** 전체 게시글 출력
	 */
	private void selectAll() {
		System.out.println("\n    [[ 전체 글 조회 ]]");
		System.out.println("=======================");
		
		List<Board> list = boardService.selectAll();
		
		if(list == null) {
			System.out.println("** 게시글이 없습니다.");
			return;
		}
	
		for(Board b : list)
			System.out.println(b);
	}
	/**
	 * 게시글 등록
	 */
	private void insertBoard() {
		String writer, title, textcontent;
		System.out.println("\n    [[ 글 쓰기 ]]");
		System.out.println("=======================");
		
		System.out.print("> 작성자 : ");
		writer = keyin.next(); 
		keyin.nextLine();   // 입력버퍼에 남아있던 엔터를 지우는 역할
		
		System.out.print("> 글제목 : ");
		title = keyin.nextLine();

		System.out.print("> 글내용 : ");
		textcontent = keyin.nextLine();
		
		Board board = new Board(0, writer, title, textcontent, 0, null);
		int result = boardService.insertBoard(board);
		
		if(result == 1)
			System.out.println("** 게시글 저장 완료");
		else
			System.out.println("** 게시글 저장 실패");
		
	}
	/**
	 * 메인 메뉴 출력
	 */
	private void menu() {
		System.out.println("    [[ 게시판 연습 ]]");
		System.out.println("=======================");
		System.out.println("     1. 글 쓰기");
		System.out.println("     2. 글 전체 목록");
		System.out.println("     3. 글 읽기");
		System.out.println("     4. 글 삭제");
		System.out.println("     5. 글 검색");
		System.out.println("     6. 글 수정");
		System.out.println("     0. 종 료");
		System.out.println("=======================");
		System.out.print  ("    선택 > ");
	}
	
}




