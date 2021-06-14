package board.vo;

public class Reply {
	private int reply_seq;
	private int board_seq;
	private String writer;
	private String text;
	private String regdate;
	
	public Reply() {}
	public Reply(int reply_seq, int board_seq, String writer, String text, String regdate) {
		super();
		this.reply_seq = reply_seq;
		this.board_seq = board_seq;
		this.writer = writer;
		this.text = text;
		this.regdate = regdate;
	}
	public int getReply_seq() {
		return reply_seq;
	}
	public int getBoard_seq() {
		return board_seq;
	}
	public String getWriter() {
		return writer;
	}
	public String getText() {
		return text;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setReply_seq(int reply_seq) {
		this.reply_seq = reply_seq;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Reply [reply_seq=" + reply_seq + ", board_seq=" + board_seq + ", writer=" + writer + ", text=" + text
				+ ", regdate=" + regdate + "]";
	}
}
