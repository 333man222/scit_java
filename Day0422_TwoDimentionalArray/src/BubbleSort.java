import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int ary[] = new int[10];
		
		//난수로 초기화
		for(int i=0; i<ary.length;++i) 
			ary[i]=rand.nextInt(100);
			
		
		//출력
		System.out.println("** 정렬 전 출력");
		for(int i=0;i<ary.length;++i)
			System.out.print(ary[i] + " ");
		System.out.println();
		
		//정렬하기
		int temp; //값의 교환을 잠시동안 저장할 변수
		for(int i=0;i<ary.length-1;++i) {
			for(int j=0;j<ary.length-i-1;++j)
			if(ary[j] > ary[j+1]) {
				temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		
		
		//정렬 후 출력
		System.out.println("** 정렬 후 출력");
		for(int i=0;i<ary.length;++i)
			System.out.print(ary[i] + " ");
		System.out.println();
	}

}
