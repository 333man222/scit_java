
public class TwoDimArray1 {

	public static void main(String[] args) {
		int[] ar1 = {11,12,13,14,15};
		int[][] ar2 = {{1,2,3,4,}, {5,6,7,8}, {9,10,11,12}};
		
		
//		System.out.println(ar2[2][0]);
//		//행개수 : 3  ar2.length ==>행의 갯수
//		//열개수 : 4  ar2[0].length ==> 열의 갯수
//		System.out.println("행개수 : " + ar2.length);
//		System.out.println("열개수 : " + ar2[0].length);
		
		for(int i=0; i<ar2.length;++i) {
			for(int j=0;j<ar2[0].length;++j) {
				System.out.printf("%3d",ar2[i][j]);
								//%와 d(정수)사이에 숫자를 넣어주면 칸을 띄어준다는 것 ex) %4d = d를 4칸씩 확보함
			}
			System.out.println();
		}
		
		
	}

}
