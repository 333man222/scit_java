
public class Example3 {
	public static void main(String[] args) {
		//���� 1: �����µ��� ȭ���µ��� �ٲپ� ����Ͻÿ�
		double f, c;
		c = 13;
		f = c * (9 / 5.0) + 32; //��������(syntax error), �������(runtime error)
		
		System.out.println("����" + c + "�ɴ� ȭ����" + f + "���Դϴ�.");
		
		//���� 13���� ȭ����xx���Դϴ�.
		
		//���� 2 : ����ü�� ���ϱ� - * �����ڸ� ����� ��
		
		//����ü�� = (Ű - 100) * 0.9
		//
			
		double cm, kg;
		cm = 170.2;
		kg = (cm - 100) * 0.9;
		
		System.out.print(cm + "cm Ű�� ����ü����");
		System.out.println(kg + "kg�Դϴ�.");
		
		/*���� 3 :
		��� 2335���� �ִ�. ���� 4300���̴�. ���Ż� 13���� ������ ������ �Ѵٸ�,
		�Ѹ�� �󸶸� ���� �ϴ°�?
		*/
		int apple , price, merchant, total;
		apple = 2335;
		price = 4300;
		merchant = 13;
		total = (apple * price) / merchant;
		System.out.println("�Ѹ�� �����ϴ� �ݾ���" + total + "�� �̴�.");
		
		/*���� 4 
		��� 1200��, ���� 1500��, ����� 700��
		��� 1�� ����1�� ����� 2�� ������� ������ ��
		*/
		
		int ramen = 1200;
		int okashi = 1500;
		int nomimono = 700;
		
		int cost = ramen * 2 + okashi * 1 + nomimono * 2;
		System.out.println("�ݾ���" + cost + "�� �Դϴ�.");
		
		/*���� 5
		 2021�� ���� �����ñ��� 8590���̴�. �Ϸ� 8�ð� �ٹ�, �� 5�� �ٹ��� �Ѵٰ� ���� ��
		 �� ���� �޿����� ����Ͻÿ�.
		 */
		
		
	}
}
