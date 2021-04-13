
public class Example2 {
	public static void main (String[] args) {
		int radius = 5;		// 원의 반지름
		int edge = 5, height = 3;		// 삼각형 밑 변의 길이와 높이
		double pi, circleArea, triangleArea ;
		
		pi = 3.141592 ;
		circleArea = radius * radius * pi ;
		triangleArea = edge * height /2.0;
		
		System.out.println("반지름 5의 면적은" + circleArea + "입니다.");
		System.out.println("한변의 길이가 5인 삼각형의 면적은" + triangleArea + "입니다.");
	}
}
