
public class StringArrayTest1 {

	public static void main(String[] args) {
		String[] sary = new String[5];
		sary[0] = "국어";
		sary[0] = "영어";
		
		String[] sarr= {"국어", "영어", "수학", "자바", "루비"};
		
		//첫번째 출력방법 : 일반적인 for문을 이용한 방법
		
		for(int i=0;i<sarr.length;++i)
			System.out.println(sarr[i]);
		
		//두번째 출력방법 : 향상된 for문을 이용한 방법
		
		for(String temp : sarr)
			System.out.println(temp);
		
		int[] iarr= {1,2,3,4,5,6};
		
		for(int temp1 : iarr)
			System.out.println(temp1);
	}

}
