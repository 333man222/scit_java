import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num[] = new int[3];
		
		System.out.println("3개의 숫자를 오름차순으로 정렬하는 프로그램입니다.");

          System.out.println("숫자 3개를 입력하세요.");



          for (int i = 0; i < num.length; i++) {

                 num[i] = input.nextInt();

          }



          for (int i = 0; i < num.length; i++) {



                 for (int j = i+1; j < num.length; j++) {



                        if (num[i] > num[j]) {



                              int temp = num[j];

                              num[j] = num[i];

                              num[i] = temp;



                        } else {



                              break;



                        }

                 }



          }



          for (int sort : num) {

                 System.out.print(sort + " ");





          }	


	}

}
