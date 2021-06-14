package board.vo;
// 痕呪, 持失切2, setter/getter, toString()
public class Board {
	private int board_seq;
	private String writer;
	private String title;
	private String textcontent;
	private int hitcount;
	private String regdate;
	
	// 持失切
	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(int board_seq, String writer, String title, String textcontent, int hitcount, String regdate) {
		super();
		this.board_seq = board_seq;
		this.writer = writer;
		this.title = title;
		this.textcontent = textcontent;
		this.hitcount = hitcount;
		this.regdate = regdate;
	}
	// setter/getter
	public int getBoard_seq() {
		return board_seq;
	}
	public String getWriter() {
		return writer;
	}
	public String getTitle() {
		return title;
	}
	public String getTextcontent() {
		return textcontent;
	}
	public int getHitcount() {
		return hitcount;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setTextcontent(String textcontent) {
		this.textcontent = textcontent;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Board [board_seq=" + board_seq + ", writer=" + writer + ", title=" + title + ", textcontent="
				+ textcontent + ", hitcount=" + hitcount + ", regdate=" + regdate + "]";
	}
}
