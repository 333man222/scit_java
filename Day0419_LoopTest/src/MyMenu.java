import java.util.Scanner;
// 1.입력 2.출력 3. 수정 4. 삭제 그외 다른값 다시 입력해 주세요 종료 0번
public class MyMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.println("     [ 선 택  ]     ");
			System.out.println("     1 . 입 력         ");
			System.out.println("     2 . 출 력         ");
			System.out.println("     3 . 수 정         ");
			System.out.println("     4 . 삭 제         ");
			System.out.println("     0 . 종 료         ");
			System.out.println("-------------------");
			System.out.print("번호를 선택 해주세요 : ");
			
			choice = scanner.nextInt();
			switch(choice) {
			case 1 : System.out.println("입력 선택");
			break;
			case 2 : System.out.println("출력 선택");
			break;
			case 3 : System.out.println("수정 선택");
			break;
			case 4 : System.out.println("삭제 선택");
			break;
			case 0 : System.out.println("프로그램 종료");
				//	 System.exit(0); //프로그램 급 종료
			 //return; // main()를 호출했던 곳으로 되돌아감 (프로그램 종료)
			return;
			default : System.out.println("잘못 입력 하셨습니다. 다시 선택해주세요.");
			}
			
		} // end while
	} // end main()

}
