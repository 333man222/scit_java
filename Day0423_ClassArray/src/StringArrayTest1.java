
public class StringArrayTest1 {

	public static void main(String[] args) {
		String[] sary = new String[5];
		sary[0] = "����";
		sary[0] = "����";
		
		String[] sarr= {"����", "����", "����", "�ڹ�", "���"};
		
		//ù��° ��¹�� : �Ϲ����� for���� �̿��� ���
		
		for(int i=0;i<sarr.length;++i)
			System.out.println(sarr[i]);
		
		//�ι�° ��¹�� : ���� for���� �̿��� ���
		
		for(String temp : sarr)
			System.out.println(temp);
		
		int[] iarr= {1,2,3,4,5,6};
		
		for(int temp1 : iarr)
			System.out.println(temp1);
	}

}
