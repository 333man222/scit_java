//반지름이 5인 원의 면적을 구하기 .... 파이* 알제곱(파이 * 5 * 5)


public class StaticTest2 {

	public static void main(String[] args) {
		int radius = 5;
		double area;
		
		area = Math.PI * radius * radius;
		
		area = Math.floor(area); // 소숫점 이하 숫자들 값을 내림
		System.out.println(area);
		
		area = Math.PI * radius * radius;
		
		area = Math.ceil(area);  // 소숫점 이하 숫자들 값을올림
		System.out.println(area);
	}

}
