
public class Example2 {
	public static void main(String[] args) {
		int second =12345; //sec 초 를 시/분/초로 세분화 시키기
							//1분=> 60초 1시간=>60분

		int hour = second / 60 / 60;
		int min = second / 60 % 60;
		int sec = second % 60 ;
				
		System.out.println("출력결과 : " + hour + "시간 " + min + "분 " + sec + "초");
		
		int hour1 = second ;
		int min1 = second / 60;
		int sec1 = 1;
		
		System.out.println("출력결과 : " + hour1 + "시간 " + min1 + "분 " + sec1 + "초");
	} 
}
