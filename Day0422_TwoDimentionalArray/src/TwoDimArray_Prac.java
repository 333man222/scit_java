
public class TwoDimArray_Prac {

	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int count = 0;
		
		for(int i=0; i<ary.length;++i) {
			for(int j=0; j<ary[0].length;++j) {
				if(i % 2 ==1) {
					ary[i][ary[i].length-(j+1)] = ++count;
				} else if(i % 2 ==0) {
					ary[i][j] = ++count;
				} 
				System.out.printf("%-4d",ary[i][j]);
				}
			System.out.println();	
		}
		
//		for(int i=0; i<ary.length;++i) {
//			for(int j=0; j<ary[0].length;++j)
//
//		}
		
		
		
		
		
	}

}
