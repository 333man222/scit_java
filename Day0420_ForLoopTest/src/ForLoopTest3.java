
public class ForLoopTest3 {
	// ���� ��ȯ ���ڿ� : %f : �Ǽ�, %d  : ����, %c : ĳ���� ,%s :��Ʈ��,, ���ڿ� , %% :%�� ��ü, %n :�ٹٲ�

	public static void main(String[] args) {
//		char ch = 'A'; //==>65��� ������ Ǯ���� �� B=66 C=67...
//		System.out.println((char)(ch+1)); // ���ڵ� ������ �����ϴ� // ũ�� �۴ٰ��� �񱳵� ����!
//		if(ch < 'a') { // �����ڵ尪 : Ű �ϳ��ϳ��� ���� �Űܳ��� ��
//			System.out.println(ch+ " �� " + 'a' + "���� �۴�.");
//		} else {
//			System.out.println(ch+ " �� " + 'a' + "���� ũ��.");			
//		}

//=====================================================
		
//		for(char i = 'Z'; i>='A'; i--) {
//			for(char ch='A'; ch<=i; ++ch) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}	

//		for(int i=1; i<=127; i++) {
//			System.out.printf("%d : %c%n",i,(char)i);
//			
//		}

//======================================================		
		
//		for (int c = 6; c<=9; ++c) {
//			for (int b = 1; b<=9; ++b) {
//				for(int a = 2; a<=5; ++a) {
//					System.out.print(a + " x " + b + " = " + (a*b) + "  ");
//				}
//				System.out.print(c + " x " + b + " = " + (b*c) + "  ");
//				System.out.println();
//			}
//			
		System.out.println();	
		
		for (int c = 0; c<=4; c+=4) {
			for (int b = 1; b<=9; ++b) {
				for(int a = 2+c; a<=5+c; ++a) {
					System.out.printf("%d * %d = %d\t",a,b,(a*b));
				}
				System.out.println();
			}
		}
//		for (int k=0; k<=4; k+=4) {
//
//			for (int i=1; i<=9; i++) {
//
//				for (int j=2+k; j<=5+k; j++) {
//
//					System.out.printf("%d * %d = %d\t", j, i, j*i);
//
//				}
//
//				System.out.println("");
//
//			}
//
//			System.out.println("");
//
//		}


	
	
	}
	

}
