import java.util.Scanner;
// ������ �ڸ� �̵�
public class Example2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int l, m, s, temp;
		
		
		System.out.print("ù��° ���� : ");
		l = scanner.nextInt();
		System.out.print("�ι�° ���� : ");
		m = scanner.nextInt();
		System.out.print("����° ���� : ");
		s = scanner.nextInt();
		
		if(l < m ) {
			temp = l;
			l = m;
			m = temp;
		} 
		if (l < s ) {
			temp = l;
			l = s;
			s = temp;
		} 
		if (m < s ) {
			temp = m;
			m = s;
			s = temp;
		}
		System.out.printf("%d\t%d\t%d",l,m,s);
		
	}

}
