class Parent {
	private String type; // 학생인지 교사인지
	Parent(){
		System.out.println("Parent 기본 생성자");
	}
	Parent(String type){
		this.type = type;
		System.out.println("Parent 일반 생성자(오버로딩 된 생성자)");
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

// 기능(메소드)을 상속받아서 확장하는 것이 일반적임
class Child extends Parent{
	private String name;
	Child() {
		super(); // 부모클래스의 기본생성자를 호출하는 코드 (안 만들어도 자동으로 들어 가 있다고 생각하면 됨)
		System.out.println("Child 기본 생성자");
	}
	Child(String type, String name) {		//<<<<<
		super(type);
		System.out.println("Child 일반 생성자(오버로드)");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 부모의 setType(), getType(), output() 이 상속받아진 상태
	@Override //부모로부터 상속받은 것을 내가 고쳤다는걸 명확히 하고싶어서 씀(생략 가능)
	public void output() {
		//super.output();		부모의 output을 호출할 때 씀
		System.out.println(super.getType() + ", " + name);	// 부모로부터 상속받은 getType을 불러올때 씀 위와 동일한 결과가 나옴  // 하는 방법이 다른것 뿐
	}
	@Override
	public String toString() {
		return getType() + ", " + name;
	}
}
public class Test {

	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("학생", "홍길동");
		
		System.out.println(c1 + ", " + c2);
		System.out.println(c2.toString());
		System.out.println(c2);
	}

}
/*
 * OOP(Object Oriented Programming : 객체지향언어)
 * 캡슐화(관련있는 데이터를 하나로 묶는 것. 메소드+데이터 하나로 묶음) 
 * 추상화(데이터를 수집(데이터 추상화) + 기능을 만드는 것(메소드 추상화))
 * 정보 은닉(데이터가 묶여져있을때 데이터를 외부로부터 보호,, Private을 통해 다른 클래스가 접근을 쉽게 못하게 하는 것)
 * 			Private가 붙어있으면 API에서도 나타나지 않음
 *  상속 : 기준에 사용중이던 클래스의 기능을 받아, 확장해서 사용하고자 할 때
 *    - 부모(super) / 자식(sub)
 *    - class 자식 extends 부모
 *    - 다중 상속 불가 ex) 부모1, 부모2, 부모3 같은 건 안됨
 *    - 부모의 private, 생성자는 상속받지 못 한다.
 *    - final 키워드를 가진 클래스는 자식 클래스를 가질 수 없다. 즉, 상속 불가
 *    - 부모클래스가 먼저 생성되고 난 후 자식 클래스가 나중에 생성 됨
 *    - 부모-자식 관계는 is-a 관계라고 부름 / 내 멤버가 다른 클래스로 들어 가 있으면has-a 관계
 *    - 오버라이딩 (부모로부터 상속받은 메소드를 내가 고쳐쓰는 것)
 *    	- 메소드 시그니처(모양)이 완전히 같아야한다.(리턴타입이 다르다거나 전달받은 메소드 갯수가 다르다거나 하면 x) 접근지정자는 부모의 접근지정자보다 범위(private이면 protect 등 다른 걸로)가 커야 함
 *    - 조상격의 클래스 : Object(모든 클래스의 조상,, 가장 위)
 *    - 
 *  다형성 : 
 *  
 */