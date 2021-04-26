// public 키워드는 : main 메소드가 있는 클래스만 가짐
// 접근 지정자 : private(메소드를 통해서만 한정적으로 접근가능) public 
// VO(Value Object) 클래스
class Friend {
	private String name; //정보 은닉을 위한 키워드 private
	private String phone;
	private int age;
	// setter 우리 멤버에 접근하여 데이터를 세팅할 수 (수정할 수 )있는 것
	//접근지정자 public 리턴타입 void 앞에 이름은 반드시 set ,, setName(String n); 같은식으로 set+첫글자 대문자영어
	
	// setter
	public void setName(String n) {
		this.name = n; // this 객체 데이터의 이름이 같거나 해도 외부에서 받은 지역변수 등과 구분을 하기 위해		
	}
	public void setPhone(String p) {
		phone = p;
	}
	public void setAge(int a) {
		age = a;
	}

	// getter
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getAge() {
		return age;
	}

}
public class EncapsulationTest {
	String temp;
	public static void main(String[] args) {
		Friend f = new Friend();
	//	f.name = "홍길동";
	//	f.phone = "010-1111-2222";
		
		f.setName("홍길동"); //접근지정자가 아무것도 붙어있지 않으면(default) 삼각형 표시
		f.setPhone("010-1234-1234");
		f.setAge(13);
		String named = "홍길동"; // 메소드 내 지역안에서만 사용되는 지역변수, 가장 우선시 됨
		
		System.out.println(f.getName());
		System.out.println(f.getPhone());
		System.out.println(f.getAge());
	}
}
