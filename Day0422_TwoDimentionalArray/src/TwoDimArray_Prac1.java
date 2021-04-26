
public class TwoDimArray_Prac1 {

	public static void main(String[] args) {
		int ary[][] = new int[5][5];
		int count = 0;
		
		for(int i=0;i<=ary.length;++i) {
			if(i % 2 == 0) {
				for(int j = 0;j<ary[0].length;++j) 
					ary[i][j] = ++count;
			} else {
				for(int j = 0;j<ary[0].length-1;++j)
					ary[i][j] = ++count;
			}

		}	
		
	}

}
