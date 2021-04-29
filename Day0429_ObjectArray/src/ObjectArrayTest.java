class Student {
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("1", "홍길동"); // 객체 생성
		
		Student[] sary = new Student[10];		// 배열 생성
		
		sary[0] = s1;
		sary[1] = new Student("2", "임꺽정");
		sary[2] = new Student("3", "손오공");	
		sary[3] = new Student("3", "전우치");
				
		for(int i = 0; i<sary.length; ++i) {
			Student tmp = sary[i];
			if(tmp == null) break;
			
			System.out.println(tmp.id + ", " + tmp.name);
		}
		
	}

}
