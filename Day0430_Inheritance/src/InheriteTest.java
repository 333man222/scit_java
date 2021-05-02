class Parent {
// private�� �پ������� ��ӺҰ�(����Ŭ���� ���ٺҰ�)	
// protected (�������), �ٸ���Ű���� �ϴ��� ����� �Ǹ� ��밡��
// package ���� ��Ű�� �ȿ��־�߸� ��밡��
// public ���� ��밡��
	private int data; 
	public Parent() { }
	public Parent(int data) {
		this.data = data;
	}
	
	public void add(int a) {
		this.data += a;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
// is-a ���� : �ƹ������� ����!
class Child extends Parent{
	public Child() {
		super(); //�θ�Ŭ������ �����ڸ� ȣ���ϴ� �ڵ�(Ŭ����).. ��ǻ�Ͱ� �ڵ� ����������(�׷��Ƿ� ��������)
		System.out.println("�ڽ� Ŭ����");
	}

}

public class InheriteTest {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.data = 10;
//		p.add(10);
//		System.out.println(p.data);
		
		Child c = new Child();
		c.setData(55);	// �θ�Ŭ������ private���� setter getter�δ� ������ �� �ִ�
		c.add(10);
		System.out.println(c.getData());
	}

}
