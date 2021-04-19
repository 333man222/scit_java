import java.util.Scanner;

// 키보드로부터 정수를 반복적으로 입력받아 입력받은 숫자를 그대로 출력
// 조건 : 입력받은 데이터가 음수이면 while문을 탈출 하도록 설정
//break : Switch문장에서 탈출하는 문장, 반복문에서도 사용 가능!
public class WhileTest1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int data;
		
		data = 0;
		while(true) {	//무한 loop , true를 쓸 경우 일단 while문에 무조건 진입
			System.out.print("정수를 입력하세요 : ");
			data = scanner.nextInt();
			
			System.out.println("입력한 데이터 ==> " + data);
			if(data < 0) break;	//while문을 빠져나가는 break문은 탈출할 수 있는 조건인지 확인
		}	//dead code
		System.out.println("End " + data);
	}

}
