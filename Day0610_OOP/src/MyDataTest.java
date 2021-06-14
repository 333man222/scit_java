//VOŬ����(Value Object Class) - ���� �����ϱ� ���� �뵵
//��κ��� ������ Ŭ������ �����ؾ� ��밡��
class Score{
	private String name;	//�޼ҵ� �ۿ� �ִ� �� 
						//�������, �ν��Ͻ� ����
	private double jumsu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getJumsu() {
		return jumsu;
	}
	public void setJumsu(double jumsu) {
		this.jumsu = jumsu;
	}
	
}
// ���������� (Access Modifier) ���� : private, protected, default, public
// �޼ҵ�(Method) ���� : ������ �ִ� ���α׷� ���

class Phone{
	private String name;
	private String address;
	private String phoneNum;
}
public class MyDataTest {

	public static void main(String[] args) {
		int jumsu; //�������� ==> �ʱ�ȭ ���ϸ� ����
		String name;
		jumsu = 98;
		name = "�տ���";
		
		Score s = new Score();	// �޸𸮿� �ε���Ű�� ���� ����
		s.setJumsu(89);
		s.setName("���Ȱ�");
		
		int kor, eng, mat, sum;
		double avg;
		
		kor=80;
		eng=78;
		mat=99;
		
		//����� ���ϴ� ���� : ���� �ִ� ���� (���� ����) ==>�Ű�����
			//��� �۾� ==> ����
		avg = (kor+eng+mat) / 3.0;	// ���� ó��(����ϴ� ��)
		
	// ��(���)�� �����ϱ� ���� �뵵 VOŬ����
	// ������ ó���ϴ� �뵵(Service Ŭ����, ManagerŬ����)
	// �����ͺ��̽� ������ ���� �뵵(daoŬ����)(Database access object - DB�� �����ؼ� ó���ϱ� ���� �뵵�� Ŭ����)
	// �����ͺ��̽� �����ؼ� service�� dao�� �����͸� ó���ϱ� ���� �뵵(dto)
		//- dao�� vo�� �����ϱ� ���� �뵵
	// mapper =>�ڹٰ�  DB�� ���������� ����� �����͸� �ְų� �ޱ����� ������ ���� �س��� Ŭ����
	
			
	}
	/*  ���������� ����Ÿ�� �޼ҵ��(��������) {
			�� �޼ҵ忡�� �ؾ��ϴ� ����;
			return;
		}
*/
	public double avg(int kor, int eng, int mat) {
		return(kor+eng+mat) / 3.0;
	}

}
