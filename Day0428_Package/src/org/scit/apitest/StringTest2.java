package org.scit.apitest;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵��";
		
		int len = str.length(); //str ���ڿ��� ���̸� ����????
		System.out.println("���ڿ��� ���� : " + len);
		
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
		
		// ������ ��ġ(index)�� �ִ� �ڵ尪(int)�� ����
		String temp = "ABCD";
		int code = temp.codePointAt(0);
		System.out.println(temp + "0��° �ڵ尪" + code);
		
		// �� ���ڿ������� Ȯ��
		String temp1 = "";		//<<<<<<<<< � �� true?
		System.out.println(temp.isEmpty());
		
		// ������ ���ڿ��� �����ϴ���  / �������� ���θ� ����
		System.out.println(str.startsWith("��"));
		System.out.println(str.endsWith("�⵵��"));
		
		// �κй��ڿ� �̾ƿ��� : ������ ��ġ���� ������ �̾ƿ�
		System.out.println(str.substring(5));
		
		// �κй��ڿ� �̾ƿ��� : ������ ��ġ���� ������ ��ġ����
		System.out.println(str.substring(5, 8));
		
		String fruit = "��� �� �ٳ��� ���� ������ ���� ����";
		
		//split
		String[] s = fruit.split(" ");
		System.out.println("�԰� ���� ���� : " + s[4]);
		for(String f : s)
			System.out.println(f);
		
	}

}
