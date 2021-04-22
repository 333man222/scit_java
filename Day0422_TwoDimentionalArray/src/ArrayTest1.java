import java.util.Random;

//컴퓨터로 하여금 랜덤수를 받아 넣는방법(배열을 초기화)
public class ArrayTest1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ary = new int[10];
		
//		for(int i=0;i<10;++i)
//		System.out.println(rand.nextInt(45));
		
		//ary 0~99 사이의값을 난수로 발생시켜 초기화 한 후 출력
		
		for(int i=0; i<ary.length; ++i) {
			ary[i] = rand.nextInt(100);  //초기화
			System.out.print(ary[i] + " "); //출력
		}
		
	}

}
