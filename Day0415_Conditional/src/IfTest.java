
public class IfTest {

	public static void main(String[] args) {
		int kor, eng, mat, total;
		double avg;
		kor = 89;
		eng = 88;
		mat = 86;
		
		total = kor + eng + mat;
		avg = total / 3.0; 
		
		//���� 1 : ��� 80�� �̻��̸� "��, ���߽��ϴ�."
		
		if(avg >=80) {
			System.out.println("��, ���߽��ϴ�.");
		}
		//���� 2 : ����� 80�� �̻��̸� "Pass", "Fail"
		if(avg>=80) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		//���� 3 : 90>=A, 80>=B, 70>=C, 60>=D, F)
		if(avg >=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		} else if(avg>=70) {
			System.out.println("C");
		} else if(avg >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
