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
				System.out.println("** ���α׷��� �����մϴ�");
				return;
			default : 
				System.out.println("** �޴��� �ٽ� �������ּ���");
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
			System.out.println("** �޴� ������ �߸��߽��ϴ�.");
			return ;
		}
		
		System.out.print("> �˻� Ű���� �Է� : ");
		searchWord = keyin.next();

		List<Board> list = boardService.searchBoard(searchItem, searchWord);
		if(list == null) {
			System.out.println("** �˻��� ������ �����ϴ�.");
			return;
		}
		
		for(Board b : list)
			System.out.println(b);
	}
	
	/**
	 * �˻��� �ϱ����� ����޴� 
	 */
	private void subMenu() {
		System.out.println("\n    [[ �� �˻� ]]");
		System.out.println("=======================");
		System.out.println("    1) �������� �˻�");
		System.out.println("    2) �ۼ��ڷ� �˻�");
		System.out.println("    3) �������� �˻�");
		System.out.println("    0) ��������");
		System.out.println("=======================");
		System.out.print  ("       > ���� : ");
		
	}
	/**
	 * �Է��� �Խñ۹�ȣ �Ѱ��� ����
	 */
	private void deleteBoard() {
		System.out.println("\n    [[ �� ���� ]]");
		System.out.println("=======================");
		int board_seq;

		System.out.print("> ������ �� ��ȣ :");
		try {
			board_seq = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** �� ��ȣ�� ���ڷ� �Է��Ͻÿ�");
			keyin.nextLine();
			return;
		}
		
		int result = boardService.deleteBoard(board_seq);
		
		if(result == 0) {
			System.out.println("** �Խñ��� �������� �ʾ� ���� ����.");
		} else {
			System.out.println("** ���� �Ϸ�");	
		}
	}
	/**
	 * �� �� ���� ��ȸ
	 * select * from board where board_seq = ?
	 */
	private void selectOne() {
		System.out.println("\n    [[ �� �б� ]]");
		System.out.println("=======================");
		int board_seq;

		System.out.print("> �� ��ȣ :");
		try {
			board_seq = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** �� ��ȣ�� ���ڷ� �Է��Ͻÿ�");
			keyin.nextLine();
			return;
		}
		
		Board board = boardService.selectOne(board_seq);
		
		if(board == null) {
			System.out.println("** �Խñ��� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println(board);
		
		List<Reply> listReply = replyService.selectAll(board_seq);

		if(listReply != null) {
			for(Reply r : listReply)
				System.out.println(r);
		}
		
		// ��� �Է��Ұ��� ���θ� ���
		String answer = null;
		System.out.print(">> ����� �Է��Ͻðڽ��ϱ�?(Y/n) ");
		answer = keyin.next();
		
		if(!answer.equals("Y")) return;
		
		System.out.print(" >> �̸� : ");
		String writer = keyin.next();
		keyin.nextLine(); 
		
		System.out.print(" >> ��� ���� : ");
		String text = keyin.nextLine();
		
		Reply temp = new Reply(0, board_seq, writer, text, null);
		
		int result = replyService.insertReply(temp);
		if(result == 1) {
			System.out.println("** ����� ��ϵǾ����ϴ�.");
		} else {
			System.out.println("** ��� ��� ����");
		}
		
		
	}
	/** ��ü �Խñ� ���
	 */
	private void selectAll() {
		System.out.println("\n    [[ ��ü �� ��ȸ ]]");
		System.out.println("=======================");
		
		List<Board> list = boardService.selectAll();
		
		if(list == null) {
			System.out.println("** �Խñ��� �����ϴ�.");
			return;
		}
	
		for(Board b : list)
			System.out.println(b);
	}
	/**
	 * �Խñ� ���
	 */
	private void insertBoard() {
		String writer, title, textcontent;
		System.out.println("\n    [[ �� ���� ]]");
		System.out.println("=======================");
		
		System.out.print("> �ۼ��� : ");
		writer = keyin.next(); 
		keyin.nextLine();   // �Է¹��ۿ� �����ִ� ���͸� ����� ����
		
		System.out.print("> ������ : ");
		title = keyin.nextLine();

		System.out.print("> �۳��� : ");
		textcontent = keyin.nextLine();
		
		Board board = new Board(0, writer, title, textcontent, 0, null);
		int result = boardService.insertBoard(board);
		
		if(result == 1)
			System.out.println("** �Խñ� ���� �Ϸ�");
		else
			System.out.println("** �Խñ� ���� ����");
		
	}
	/**
	 * ���� �޴� ���
	 */
	private void menu() {
		System.out.println("    [[ �Խ��� ���� ]]");
		System.out.println("=======================");
		System.out.println("     1. �� ����");
		System.out.println("     2. �� ��ü ���");
		System.out.println("     3. �� �б�");
		System.out.println("     4. �� ����");
		System.out.println("     5. �� �˻�");
		System.out.println("     6. �� ����");
		System.out.println("     0. �� ��");
		System.out.println("=======================");
		System.out.print  ("    ���� > ");
	}
	
}




