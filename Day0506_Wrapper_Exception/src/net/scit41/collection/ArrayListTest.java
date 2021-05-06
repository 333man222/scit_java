package net.scit41.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add("아이스아메리카노");
		list1.add("카푸치노");
		list1.add("카페라떼");
		list1.add("그린티라떼");
		
		System.out.println(list1.size()); 		//list1의 크기를 나타낼 때
		
		for(String temp : list1)
			System.out.println(temp);
		System.out.println();
		
		System.out.println(list1.get(0));		//list1의 n번째 방의 값을 불러옴
		System.out.println();
		list1.add(1, "코코아");
		
		for(String temp1 : list1)
		System.out.println(temp1);
		
		System.out.println(list1.isEmpty());	//list1이 비어있는지 확인
		
		// list1.clear();							//list1의 배열 안 모든 내용 삭제
		
		System.out.println(list1.isEmpty());
		System.out.println();
		
		System.out.println(list1.contains("코코아"));	//list1 안에 해당 문자열이 있는지 확인
		System.out.println(list1.indexOf("카페라떼"));	//list1안에 해당 문자열이 몇번째로 들어가 있는지 확인
		
		System.out.println(list1.remove(1));			//list1 안 해당 문자열 삭제 (해당배열 숫자or문자열 입력)
		System.out.println();
		
		for(String temp2 : list1)
			System.out.println(temp2);
		
	}

}
