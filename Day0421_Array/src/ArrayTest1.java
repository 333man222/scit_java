// array(배열) : **같은자료형**의 데이터(변수)가 여러개 선언되어 사용..
// 일반변수 : 초기화(;)를 반드시 해야함 안하면 오류
// 배열은 자동으로 0으로 초기화된 상태로 제공됨
// 기본값(0, 0.0, false)로 초기화됨
// 단점  1) 프로그램 실행중 크기를 조정할 수 없다!
//		2) 여러종류의 데이터타입을 넣는 배열은 만들 수 없다.
// [] : 1차원 배열
// [][] : 2차원 배열

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] ary = new int[5];
		int[] a = {11, 15, 20, 30, 40, 1, 31, 302, 42, 67};
		int[] b;
		b = new int[10];
		
		System.out.println("방의갯수 " +a.length);
		for(int i=0; i<a.length;++i)
			System.out.println(a[i]);
		
		//=========================
		char[] ch = {'a', 'b', 'c', 'D', '$'};
		for(int i=0;i<ch.length;++i)
			System.out.println(ch[i]);
		
		String[] names = {"홍길동","임꺽정","사오정","손오공"};
		for(int i=0; i<names.length;++i) {
			System.out.println(names[i]);
		}
		System.out.println(names.length);
	}

}
