
public class OperTest2 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		// 증감연산자 : ++(increment), --(decrement)
		// ++연산자 = 우선순위 1순위 : 변수의 앞에쓸 경우,, 변수의 뒤에 쓰면 연산자 우선수위 낮아짐
		b = a++;
		
		System.out.println(a + ", " + b);
		
		//======데이터 자리 이동=========
		int x, y, z, temp;
		x = 25;
		y = 40;
		z = 35;
		
		System.out.println("x= :" + x + ", y= " + y + ", z= " + z);
		
		temp = x;
		x = y;
		y = z;
		z = temp;
	
		System.out.println("x= :" + x + ", y= " + y+ ", z=" + z);
		
		
		
		
	}
}
