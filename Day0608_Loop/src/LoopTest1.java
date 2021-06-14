import java.util.Scanner;

public class LoopTest1 {

	public static void main(String[] args) {
		//제어변수 선언 ; 조건식(if); 증감식
		Scanner keyin = new Scanner (System.in);
		
		int dan = 3; //지역변수
		
		for(int i =1; i<10;i=i+i) {
			System.out.println(dan * i);
		}
		
	/*
	 * 두개의 정수를 입력받고 실행하고자 하는 연산을 입력 받아서 
	 * 연산을 완성하는 코드를 작성하시오.
	 * 첫번쨰 숫자 : 	_
	 * 두번쨰 숫자 : 	_
	 * 1.덧셈
	 * 2.뺄셈
	 * 3.곱셈
	 * 4.나눗셈
	 * ================
	 * 연산선택 : 
	 * 결과 : 
	 * 
	 * 	
	 */
	int a,b;
	int cal;
	System.out.print("첫번째 정수 입력 : ");
	a = keyin.nextInt();
	System.out.print("두번째 정수 입력 : ");
	b= keyin.nextInt();

	
	while(true) {
		
		System.out.println("어떤 연산?");
		System.out.println(" 1. 덧셈");
		System.out.println(" 2. 뺄셈");
		System.out.println(" 3. 곱셈");
		System.out.println(" 4. 나눗셈");
		System.out.print("연산 선택 : ");
		cal = keyin.nextInt();
		
		
		switch(cal) {
		case 1:
			System.out.println(a+"+"+b+"="+(a+b));
			return;
		case 2:
			System.out.println(a+"-"+b+"="+(a-b));
			return;
		case 3:
			System.out.println(a+"*"+b+"="+(a*b));
			return;
		case 4:
			System.out.println(a+"/"+b+"="+(a/b));
			return;
			default :
			System.out.println("번호 재입력");
			continue;
		}
	}
		
		
	}

}
