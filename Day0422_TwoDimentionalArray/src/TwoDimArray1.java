
public class TwoDimArray1 {

	public static void main(String[] args) {
		int[] ar1 = {11,12,13,14,15};
		int[][] ar2 = {{1,2,3,4,}, {5,6,7,8}, {9,10,11,12}};
		
		
//		System.out.println(ar2[2][0]);
//		//�ళ�� : 3  ar2.length ==>���� ����
//		//������ : 4  ar2[0].length ==> ���� ����
//		System.out.println("�ళ�� : " + ar2.length);
//		System.out.println("������ : " + ar2[0].length);
		
		for(int i=0; i<ar2.length;++i) {
			for(int j=0;j<ar2[0].length;++j) {
				System.out.printf("%3d",ar2[i][j]);
								//%�� d(����)���̿� ���ڸ� �־��ָ� ĭ�� ����شٴ� �� ex) %4d = d�� 4ĭ�� Ȯ����
			}
			System.out.println();
		}
		
		
	}

}
