import java.util.Random;

//��ǻ�ͷ� �Ͽ��� �������� �޾� �ִ¹��(�迭�� �ʱ�ȭ)
public class ArrayTest1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ary = new int[10];
		
//		for(int i=0;i<10;++i)
//		System.out.println(rand.nextInt(45));
		
		//ary 0~99 �����ǰ��� ������ �߻����� �ʱ�ȭ �� �� ���
		
		for(int i=0; i<ary.length; ++i) {
			ary[i] = rand.nextInt(100);  //�ʱ�ȭ
			System.out.print(ary[i] + " "); //���
		}
		
	}

}
