
public class ContinueTest {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			++i;
			// if(i == 5) continue; ==> continue �ؿ� ������ �ǳʶ�� ����
			if (i % 2 != 0) continue;
			System.out.println(i);

		}
		System.out.println("End");
		
	}

}
