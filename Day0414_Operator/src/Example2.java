
public class Example2 {
	public static void main(String[] args) {
		int second =12345; //sec �� �� ��/��/�ʷ� ����ȭ ��Ű��
							//1��=> 60�� 1�ð�=>60��

		int hour = second / 60 / 60;
		int min = second / 60 % 60;
		int sec = second % 60 ;
				
		System.out.println("��°�� : " + hour + "�ð� " + min + "�� " + sec + "��");
		
		int hour1 = second ;
		int min1 = second / 60;
		int sec1 = 1;
		
		System.out.println("��°�� : " + hour1 + "�ð� " + min1 + "�� " + sec1 + "��");
	} 
}
