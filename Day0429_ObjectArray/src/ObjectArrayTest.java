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
		
		Student s1 = new Student("1", "ȫ�浿"); // ��ü ����
		
		Student[] sary = new Student[10];		// �迭 ����
		
		sary[0] = s1;
		sary[1] = new Student("2", "�Ӳ���");
		sary[2] = new Student("3", "�տ���");	
		sary[3] = new Student("3", "����ġ");
				
		for(int i = 0; i<sary.length; ++i) {
			Student tmp = sary[i];
			if(tmp == null) break;
			
			System.out.println(tmp.id + ", " + tmp.name);
		}
		
	}

}
