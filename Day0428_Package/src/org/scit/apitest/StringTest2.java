package org.scit.apitest;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록";
		
		int len = str.length(); //str 문자열의 길이를 리턴????
		System.out.println("문자열의 길이 : " + len);
		
/*		codePointAt(int index)
		concat(String str)
		contains(CharSequence s)
		endsWith(String suffix)
		equals(Object anObject)
		indexOf(int ch)
		isEmpty()
		lastIndexOf(int ch)
		replace(CharSequence target, CharSequence replacement)
		split(String regex)
		substring(int beginIndex)
		substring(int beginIndex, int endIndex)
		trim()
*/

		
		System.out.println(str.charAt(2));
		
		// 지정한 위치(index)에 있는 코드값(int)을 리턴
		String temp = "ABCD";
		int code = temp.codePointAt(0);
		System.out.println(temp + "0번째 코드값" + code);
		
		// 빈 문자열인지의 확인
		String temp1 = "";		//<<<<<<<<< 어떤 때 true?
		System.out.println(temp.isEmpty());
		
		// 지정한 문자열로 시작하는지  / 끝나는지 여부를 리턴
		System.out.println(str.startsWith("동"));
		System.out.println(str.endsWith("닳도록"));
		
		// 부분문자열 뽑아오기 : 지정한 위치부터 끝까지 뽑아옴
		System.out.println(str.substring(5));
		
		// 부분문자열 뽑아오기 : 지정한 위치부터 지정한 위치까지
		System.out.println(str.substring(5, 8));
		
		String fruit = "사과 배 바나나 딸기 복숭아 참외 수박";
		
		//split
		String[] s = fruit.split(" ");
		System.out.println("먹고 싶은 과일 : " + s[4]);
		for(String f : s)
			System.out.println(f);
		
	}

}
