import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int ary[] = new int[10];
		
		//������ �ʱ�ȭ
		for(int i=0; i<ary.length;++i) 
			ary[i]=rand.nextInt(100);
			
		
		//���
		System.out.println("** ���� �� ���");
		for(int i=0;i<ary.length;++i)
			System.out.print(ary[i] + " ");
		System.out.println();
		
		//�����ϱ�
		int temp; //���� ��ȯ�� ��õ��� ������ ����
		for(int i=0;i<ary.length-1;++i) {
			for(int j=0;j<ary.length-i-1;++j)
			if(ary[j] > ary[j+1]) {
				temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		
		
		//���� �� ���
		System.out.println("** ���� �� ���");
		for(int i=0;i<ary.length;++i)
			System.out.print(ary[i] + " ");
		System.out.println();
	}

}
