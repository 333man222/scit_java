import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class BookVO implements Serializable {
	private String isbn;
	private String bookTitle;
	private int price;
	public BookVO() {} //기본 생성자
	public BookVO(String isbn, String bookTitle, int price) { //오버로딩된 생성자
		super();
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public int getPrice() {
		return price;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVO [isbn=" + isbn + ", bookTitle=" + bookTitle + ", price=" + price + "]";
	}
}

public class SerialTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		output(); //저장 용도
		input(); //불러들이는 용도
	}
	public static void output() throws IOException {
		BookVO book = new BookVO("123", "스노우맨", 18000);
		BookVO java = new BookVO("345", "그림으로 배우는 자바", 20000);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
		
		oos.writeObject(book);
		oos.writeObject(java);
		
		if(oos != null) oos.close();
		System.out.println("저장 완료!");
	}
	public static void input() throws IOException, ClassNotFoundException {
		ObjectInputStream oii = null ; 			// - BookVO라는 것을 못 찾았을때를 위해 쓴 것
		
		oii = new ObjectInputStream(new FileInputStream("book.dat"));
		
		try { 
			while(true) {
				BookVO book = (BookVO) oii.readObject();//try catch를 반드시 해줘야 함	//하향캐스트
				System.out.println(book);
			}
		} catch(EOFException e) {	//파일의 끝에 도달했다는 EOFException
			if(oii != null) oii.close();
		}
	}
}
