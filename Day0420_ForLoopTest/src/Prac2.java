import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num[] = new int[3];
		
		System.out.println("3���� ���ڸ� ������������ �����ϴ� ���α׷��Դϴ�.");

          System.out.println("���� 3���� �Է��ϼ���.");



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
