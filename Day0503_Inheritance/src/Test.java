class Parent {
	private String type; // �л����� ��������
	Parent(){
		System.out.println("Parent �⺻ ������");
	}
	Parent(String type){
		this.type = type;
		System.out.println("Parent �Ϲ� ������(�����ε� �� ������)");
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	public void output() {
		System.out.println(type);
	}
}

// ���(�޼ҵ�)�� ��ӹ޾Ƽ� Ȯ���ϴ� ���� �Ϲ�����
class Child extends Parent{
	private String name;
	Child() {
		super(); // �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� �ڵ� (�� ���� �ڵ����� ��� �� �ִٰ� �����ϸ� ��)
		System.out.println("Child �⺻ ������");
	}
	Child(String type, String name) {		//<<<<<
		super(type);
		System.out.println("Child �Ϲ� ������(�����ε�)");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// �θ��� setType(), getType(), output() �� ��ӹ޾��� ����
	@Override //�θ�κ��� ��ӹ��� ���� ���� ���ƴٴ°� ��Ȯ�� �ϰ�; ��(���� ����)
	public void output() {
		//super.output();		�θ��� output�� ȣ���� �� ��
		System.out.println(super.getType() + ", " + name);	// �θ�κ��� ��ӹ��� getType�� �ҷ��ö� �� ���� ������ ����� ����  // �ϴ� ����� �ٸ��� ��
	}
	@Override
	public String toString() {
		return getType() + ", " + name;
	}
}
public class Test {

	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("�л�", "ȫ�浿");
		
		System.out.println(c1 + ", " + c2);
		System.out.println(c2.toString());
		System.out.println(c2);
	}

}
/*
 * OOP(Object Oriented Programming : ��ü������)
 * ĸ��ȭ(�����ִ� �����͸� �ϳ��� ���� ��. �޼ҵ�+������ �ϳ��� ����) 
 * �߻�ȭ(�����͸� ����(������ �߻�ȭ) + ����� ����� ��(�޼ҵ� �߻�ȭ))
 * ���� ����(�����Ͱ� ������������ �����͸� �ܺηκ��� ��ȣ,, Private�� ���� �ٸ� Ŭ������ ������ ���� ���ϰ� �ϴ� ��)
 * 			Private�� �پ������� API������ ��Ÿ���� ����
 *  ��� : ���ؿ� ������̴� Ŭ������ ����� �޾�, Ȯ���ؼ� ����ϰ��� �� ��
 *    - �θ�(super) / �ڽ�(sub)
 *    - class �ڽ� extends �θ�
 *    - ���� ��� �Ұ� ex) �θ�1, �θ�2, �θ�3 ���� �� �ȵ�
 *    - �θ��� private, �����ڴ� ��ӹ��� �� �Ѵ�.
 *    - final Ű���带 ���� Ŭ������ �ڽ� Ŭ������ ���� �� ����. ��, ��� �Ұ�
 *    - �θ�Ŭ������ ���� �����ǰ� �� �� �ڽ� Ŭ������ ���߿� ���� ��
 *    - �θ�-�ڽ� ����� is-a ������ �θ� / �� ����� �ٸ� Ŭ������ ��� �� ������has-a ����
 *    - �������̵� (�θ�κ��� ��ӹ��� �޼ҵ带 ���� ���ľ��� ��)
 *    	- �޼ҵ� �ñ״�ó(���)�� ������ ���ƾ��Ѵ�.(����Ÿ���� �ٸ��ٰų� ���޹��� �޼ҵ� ������ �ٸ��ٰų� �ϸ� x) ���������ڴ� �θ��� ���������ں��� ����(private�̸� protect �� �ٸ� �ɷ�)�� Ŀ�� ��
 *    - ������� Ŭ���� : Object(��� Ŭ������ ����,, ���� ��)
 *    - 
 *  ������ : 
 *  
 */