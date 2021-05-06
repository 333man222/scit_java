package net.scit41.wrapper;
// Double형 Wrapper 클래스
public class WrapperTest2 {

	public static void main(String[] args) {
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		String tmp = "3.14E2";	//E = 10의 제곱할때 씀
		double d = Double.parseDouble(tmp);
		System.out.println(d * 2);
		System.out.println(Double.isFinite(d/0));	// 값이 유한대인지? 묻는 것 (무한대이므로 false)
		
	}

}
