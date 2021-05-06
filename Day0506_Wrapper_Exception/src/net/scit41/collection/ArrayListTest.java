package net.scit41.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add("���̽��Ƹ޸�ī��");
		list1.add("īǪġ��");
		list1.add("ī���");
		list1.add("�׸�Ƽ��");
		
		System.out.println(list1.size()); 		//list1�� ũ�⸦ ��Ÿ�� ��
		
		for(String temp : list1)
			System.out.println(temp);
		System.out.println();
		
		System.out.println(list1.get(0));		//list1�� n��° ���� ���� �ҷ���
		System.out.println();
		list1.add(1, "���ھ�");
		
		for(String temp1 : list1)
		System.out.println(temp1);
		
		System.out.println(list1.isEmpty());	//list1�� ����ִ��� Ȯ��
		
		// list1.clear();							//list1�� �迭 �� ��� ���� ����
		
		System.out.println(list1.isEmpty());
		System.out.println();
		
		System.out.println(list1.contains("���ھ�"));	//list1 �ȿ� �ش� ���ڿ��� �ִ��� Ȯ��
		System.out.println(list1.indexOf("ī���"));	//list1�ȿ� �ش� ���ڿ��� ���°�� �� �ִ��� Ȯ��
		
		System.out.println(list1.remove(1));			//list1 �� �ش� ���ڿ� ���� (�ش�迭 ����or���ڿ� �Է�)
		System.out.println();
		
		for(String temp2 : list1)
			System.out.println(temp2);
		
	}

}
