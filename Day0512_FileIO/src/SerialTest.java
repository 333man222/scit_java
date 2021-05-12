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
	public BookVO() {} //�⺻ ������
	public BookVO(String isbn, String bookTitle, int price) { //�����ε��� ������
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
		output(); //���� �뵵
		input(); //�ҷ����̴� �뵵
	}
	public static void output() throws IOException {
		BookVO book = new BookVO("123", "������", 18000);
		BookVO java = new BookVO("345", "�׸����� ���� �ڹ�", 20000);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
		
		oos.writeObject(book);
		oos.writeObject(java);
		
		if(oos != null) oos.close();
		System.out.println("���� �Ϸ�!");
	}
	public static void input() throws IOException, ClassNotFoundException {
		ObjectInputStream oii = null ; 			// - BookVO��� ���� �� ã�������� ���� �� ��
		
		oii = new ObjectInputStream(new FileInputStream("book.dat"));
		
		try { 
			while(true) {
				BookVO book = (BookVO) oii.readObject();//try catch�� �ݵ�� ����� ��	//����ĳ��Ʈ
				System.out.println(book);
			}
		} catch(EOFException e) {	//������ ���� �����ߴٴ� EOFException
			if(oii != null) oii.close();
		}
	}
}
