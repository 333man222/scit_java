
public class ScoreTest {
	public static void main(String[] args) {
		// constructor�� ����ڰ� �� ���� JVM�� ������ش�.
		// ��ü�� �����ϰ�, �ʱ�ȭ ��Ű�� ����
		Score s = new Score(); // new�� ���ؼ� Score ��ü(������)�� ����.. ()�ȿ� �ƹ��͵� �ȵ��� �⺻������ ��� �θ�
								// ���� : �⺻������ ������(0, false, null(���ڿ�))
		s.output();
		
		s.setName("ȫ�浿");
		s.setKor(90);
		s.setEng(88);
		s.setMat(82);
		s.output();
		
		s.setMat(90);
		s.output();

		
	}

}
