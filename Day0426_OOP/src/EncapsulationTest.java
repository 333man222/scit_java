// public Ű����� : main �޼ҵ尡 �ִ� Ŭ������ ����
// ���� ������ : private(�޼ҵ带 ���ؼ��� ���������� ���ٰ���) public 
// VO(Value Object) Ŭ����
class Friend {
	private String name; //���� ������ ���� Ű���� private
	private String phone;
	private int age;
	// setter �츮 ����� �����Ͽ� �����͸� ������ �� (������ �� )�ִ� ��
	//���������� public ����Ÿ�� void �տ� �̸��� �ݵ�� set ,, setName(String n); ���������� set+ù���� �빮�ڿ���
	
	// setter
	public void setName(String n) {
		this.name = n; // this ��ü �������� �̸��� ���ų� �ص� �ܺο��� ���� �������� ��� ������ �ϱ� ����		
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
	//	f.name = "ȫ�浿";
	//	f.phone = "010-1111-2222";
		
		f.setName("ȫ�浿"); //���������ڰ� �ƹ��͵� �پ����� ������(default) �ﰢ�� ǥ��
		f.setPhone("010-1234-1234");
		f.setAge(13);
		String named = "ȫ�浿"; // �޼ҵ� �� �����ȿ����� ���Ǵ� ��������, ���� �켱�� ��
		
		System.out.println(f.getName());
		System.out.println(f.getPhone());
		System.out.println(f.getAge());
	}
}
