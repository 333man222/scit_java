import java.util.Random;

public class ArrayTest2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ary = new int[5];
		int[] temp;
		
		temp = ary;  //���� ����
		
		
		//�ʱ�ȭ
		for(int i=0; i<ary.length;++i)
			ary[i] = rand.nextInt(50);
		

		ary[0] = 100;
		//���
		System.out.println("ary �迭 ���");
		for(int i=0;i<ary.length;++i)
			System.out.print(ary[i]+ " ");
		
		System.out.println();
		

		
		//temp �迭 ���
		
		System.out.println("temp �迭 ���");
		for(int i=0;i<temp.length;++i)
			System.out.print(temp[i] + " ");
		
		System.out.println();
	}

}
