
public class DataType {
	public static void main(String[] args) {
	/**
	 * 설명을 위한 주석(문서주석) /**을 쓰면 작성 됨
	 */
		// 변수 선언 및 초기화
		byte bt = 1; //bt라는 이름의 변수를 메모리에 만들어달라는 뜻. 사용법 : 타입 변수명
		short sh = 10;
		int it = 100;  // 연산의 기본 타입 뒤에 L이 안 써 있으면 기본적으로 int형임
		long ln = 200L; // 값 200이 long형이다 라는 뜻
		
		System.out.println(bt);
		System.out.println(sh);
		System.out.println(it);
		System.out.println(ln);
		
		//=====================
		float fl = 3.14159F;
		double db = 3.14159; // 연산의 기본타입
		System.out.println(fl);
		System.out.println(db);
		
		//======================
		boolean bool = false; //비교연산 논리연산의 결과로 사용됨
		System.out.println( fl == db );
		System.out.println( bt < sh );
		System.out.println(bool);
		
		//=======================
		char ch = '=';
		System.out.println(ch);
		
		//=======================
		String name = "홍길동"; //"", " ","강" 큰따옴표가 있으면 문자가 안들어가도 문자열로 인식
		System.out.println(name);
	}
}
