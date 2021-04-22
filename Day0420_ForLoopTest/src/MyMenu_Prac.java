import java.util.Scanner;

// 1.입력 2.출력 3. 수정 4. 삭제 그외 다른값 다시 입력해 주세요 종료 0번
public class MyMenu_Prac {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;

		while(true) {
			System.out.println("     [ 선 택  ]     ");
			System.out.println("     1 . 입 력         ");
			System.out.println("     2 . 출 력         ");
			System.out.println("     3 . 수 정         ");
			System.out.println("     4 . 삭 제         ");
			System.out.println("     0 . 종 료         ");
			System.out.println("-------------------");
			System.out.print("번호를 선택 해주세요 : ");
			input = scanner.nextInt();

			switch(input){
			case 1 :
				System.out.println("입 력");
				break;
			case 2 :
				System.out.println("출 력");
				break;
			case 3 :
				System.out.println("수 정");
				break;
			case 4 :
				System.out.println("삭 제");
				break;
			case 0 :
				System.out.println("종 료");
				return;
			default : 
				System.out.println("잘못 입력 하셨습니다.");
			}
			scanner.close();
		}
		
	}

}
