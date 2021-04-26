//MyReviewVO
public class Exam {
	
	private String bookCode;
	private int hyouka;
	private String title;
	private String review;
	private String userid;
	private String day;
	private int count;
	
	
	public String getBookCode() {
		return bookCode;
	}
	public int getHyouka() {
		return hyouka;
	}
	public String getTitle() {
		return title;
	}
	public String getReview() {
		return review;
	}
	public String getUserid() {
		return userid;
	}
	public String getDay() {
		return day;
	}
	public int getCount() {
		return count;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public void setHyouka(int hyouka) {
		this.hyouka = hyouka;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void output() {
		System.out.printf("%s 별점 : %d, %s %n%s %n%s, %s 공감수 : %d",bookCode,hyouka,title,review,userid,day,count);
	}
	
}
