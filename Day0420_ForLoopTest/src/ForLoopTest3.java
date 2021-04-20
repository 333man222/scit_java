
public class ForLoopTest3 {
	// 형식 변환 문자열 : %f : 실수, %d  : 정수, %c : 캐릭터 ,%s :스트링,, 문자열 , %% :%그 자체, %n :줄바꿈

	public static void main(String[] args) {
//		char ch = 'A'; //==>65라는 값으로 풀려서 들어감 B=66 C=67...
//		System.out.println((char)(ch+1)); // 문자도 연산이 가능하다 // 크다 작다같은 비교도 가능!
//		if(ch < 'a') { // 유니코드값 : 키 하나하나에 값을 매겨놓은 것
//			System.out.println(ch+ " 가 " + 'a' + "보다 작다.");
//		} else {
//			System.out.println(ch+ " 가 " + 'a' + "보다 크다.");			
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
