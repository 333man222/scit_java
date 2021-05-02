class Parent {
// private이 붙어있으면 상속불가(하위클래스 접근불가)	
// protected (상속전용), 다른패키지라 하더라도 상속이 되면 사용가능
// package 같은 패키지 안에있어야만 사용가능
// public 전부 사용가능
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
// is-a 관계 : 아버지꺼가 내꺼!
class Child extends Parent{
	public Child() {
		super(); //부모클래스의 생성자를 호출하는 코드(클래스).. 컴퓨터가 자동 생성시켜줌(그러므로 생략가능)
		System.out.println("자식 클래스");
	}

}

public class InheriteTest {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.data = 10;
//		p.add(10);
//		System.out.println(p.data);
		
		Child c = new Child();
		c.setData(55);	// 부모클래스가 private여도 setter getter로는 가져올 수 있다
		c.add(10);
		System.out.println(c.getData());
	}

}
