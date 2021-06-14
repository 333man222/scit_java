package _Exercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner (System.in);
		
		int i;
		System.out.print("정수 입력 : ");
		i = keyin.nextInt();
		
		if(i % 3 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		int x = 10, y = 11, z = 14;
		double avg;
		
		avg = (x+y+z)/3.0;
		System.out.println(avg);
		
		
		
	}

}
