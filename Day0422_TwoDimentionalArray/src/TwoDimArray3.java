
public class TwoDimArray3 {

	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int count = 0;
		
		for(int i=0; i<ary.length;++i) {
			for(int j=0; j<ary[0].length;++j) {
				if(i == j) {
					ary[i][j] = ++count;
				}
				System.out.print(ary[i][j]);
				}
		System.out.println();
		}
		
	}

}
