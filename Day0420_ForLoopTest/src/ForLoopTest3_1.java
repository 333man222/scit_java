//구구단 1단~8단 쓰기
public class ForLoopTest3_1 {

	public static void main(String[] args) {
		
		for(int k=0; k<=3;k+=3) {
			for(int j = 1; j<=9; ++j) {
				for(int i = 2+k; i<=5+k; ++i) {
					System.out.printf("%d x %d = %d\t",i,j,(i*j));
				}
				System.out.println();
			}	
		}	
	}

}
