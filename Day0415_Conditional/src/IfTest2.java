//2���� ���迡��
//����� 60���̻��̸� "�հ�"
//�� ������ 40�� �̸��̸� ����� 60�̻��̾ "���հ�"
public class IfTest2 {

	public static void main(String[] args) {
		int score1 = 80, score2 = 42 , total;
		double avg;
		String result;
/*		total = score1 + score2;
		avg = total / 2.0;
		
		if(score1 < 40 && score2 <40) {
			System.out.println("���հ�");
		}
		if(avg >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
*/		
		total = score1 + score2;
		avg = total / 2.0;
		
		if(avg >=60 && score1>= 40 && score2>=40) {
			result = "�հ�";
		} else {
			result = "���հ�";
		}
		System.out.println(result);
	}

}
