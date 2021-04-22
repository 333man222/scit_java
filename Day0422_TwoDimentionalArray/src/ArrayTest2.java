import java.util.Random;

public class ArrayTest2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ary = new int[5];
		int[] temp;
		
		temp = ary;  //얕은 복사
		
		
		//초기화
		for(int i=0; i<ary.length;++i)
			ary[i] = rand.nextInt(50);
		

		ary[0] = 100;
		//출력
		System.out.println("ary 배열 출력");
		for(int i=0;i<ary.length;++i)
			System.out.print(ary[i]+ " ");
		
		System.out.println();
		

		
		//temp 배열 출력
		
		System.out.println("temp 배열 출력");
		for(int i=0;i<temp.length;++i)
			System.out.print(temp[i] + " ");
		
		System.out.println();
	}

}
