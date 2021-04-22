import java.util.Scanner;
// 데이터 자리 이동
public class Example2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int l, m, s, temp;
		
		
		System.out.print("첫번째 숫자 : ");
		l = scanner.nextInt();
		System.out.print("두번째 숫자 : ");
		m = scanner.nextInt();
		System.out.print("세번째 숫자 : ");
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
