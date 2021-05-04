package net.scit41.guestbook;
//글 번호, 제목, 내용, 날짜, 이름(닉네임), 비밀번호
public class GuestbookVO {
	private int guestbookNo;
	private String title;
	private String content;
	private String regdate;
	private String writer;
	private String password;
	public GuestbookVO() { }
	public GuestbookVO(int guestbookNo, String title, String content, String regdate, String writer, String password) {
		super();
		this.guestbookNo = guestbookNo;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.writer = writer;
		this.password = password;
	}
	
	public int getGuestbookNo() {
		return guestbookNo;
	}
	public void setGuestbookNo(int guestbookNo) {
		this.guestbookNo = guestbookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "GuestbookVO [guestbookNo=" + guestbookNo + ", title=" + title + ", content=" + content + ", regdate="
				+ regdate + ", writer=" + writer + ", password=" + password + "]";
	}
	
}

