
public class TwoDimArray2 {

	public static void main(String[] args) {
		int count = 0;
		int[][] ary = new int[5][5];
		
		//초기화
		for(int i=0;i<ary.length;++i) 
			for(int j=0;j<ary[0].length;++j) 
				ary[i][j] = ++count;
		
		System.out.println(count);
		
		
		//출력
		for(int i=0; i<ary.length;++i) {
			for(int j=0; j<ary[0].length; ++j) {
				System.out.printf("%4d",ary[i][j]);
			}
			System.out.println();
		}
	}

}
