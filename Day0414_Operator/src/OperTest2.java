
public class OperTest2 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		// ���������� : ++(increment), --(decrement)
		// ++������ = �켱���� 1���� : ������ �տ��� ���,, ������ �ڿ� ���� ������ �켱���� ������
		b = a++;
		
		System.out.println(a + ", " + b);
		
		//======������ �ڸ� �̵�=========
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
