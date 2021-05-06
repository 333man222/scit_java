package net.scit41.except;
// ������ 0�� ������ �Ҵ�(����)
// �Ǽ��� 0�� ������ ���Ѵ�
public class ExceptionTest1 {
	public static void main(String[] args) {
		try {
			String[] str = {"123", "abc", "0", "12a", "korea"};
			
			int a, b, c;
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[2]);
			//c = Integer.parseInt(str[1]);	//NumberFormatException
			
			//System.out.println(a/b);		// ArithmeticException
			
			String s = str[5];				// ArrayIndexOutOfBoundsException
			System.out.println(s);
	
		
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
