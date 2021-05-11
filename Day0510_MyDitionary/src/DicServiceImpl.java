import java.util.Map;
import java.util.Scanner;

public class DicServiceImpl implements DicService {
	Map<String, String> dic;
	Scanner keyin = new Scanner(System.in); 
	
	public DicServiceImpl(Map<String, String> dic) {
		this.dic = dic;
		String choice; // �޴��� �������� �� �Է¹��� ����
		String word, mean;
		DictionaryVO vo = null;
		int result = 0;
		
		while(true) {
			menu();
			choice = keyin.nextLine();
			
			switch(choice) {
			case "1" : 
				vo = input(); // �Է� ���� �޼ҵ�
				result = regist(vo.getWord(), vo.getMean());
				if(result == 1) {
					System.out.println("** ����� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("** ����� �����߽��ϴ�.");
				}
				break;
				
			case "2" :
				word = inputWord();
				
				mean = search(word);
				if(mean == null)
					System.out.println("** ��ϵ� �ܾ �����ϴ�.");
				else 
					System.out.println("> ã�� �ܾ� : " + mean);
				break;
			case "3" :
				vo = input();
				
				result = modify(vo.getWord(), vo.getMean());
				if(result == 1) 
					System.out.println("** ������ �Ϸ�Ǿ����ϴ�.");
				else
					System.out.println("** ���� �۾��� �Ϸ���� ���߽��ϴ�.");
				
				break;
			case "4" :
				word = inputWord();
				
				result = delete(word);
				if(result == 1) 
					System.out.println("** ������ �Ϸ�Ǿ����ϴ�.");
				else
					System.out.println("** ���� ���߽��ϴ�.");

				break;
				
			case "0" :
				System.out.println("** ���α׷��� �����մϴ�.");
				return ;
			}
		}
	}
	
	// �ܾ�� �ǹ̸� ��� �Է¹޴� �޼ҵ�
	private DictionaryVO input() {
		String word = null, mean=null;
		
		System.out.print("> �ܾ� �Է� :"); 
		word = keyin.nextLine();
		System.out.print("> �ǹ� �Է� :"); 
		mean = keyin.nextLine();  // ������ �Է¹���
		
		return new DictionaryVO(word, mean); // VO�� �����ϰų�, �迭�� ����
	}
	// �ܾ �Է¹޴� �޼ҵ�
	private String inputWord() {
		String word = null;
		
		System.out.print("> �ܾ� �Է� :"); 
		word = keyin.nextLine();
		
		return word; // VO�� �����ϰų�, �迭�� ����
	}

	private void menu() {
		System.out.println("     [ �ܾ� ���� ] ");
		System.out.println("====================");
		System.out.println("    1) �ܾ� ���");
		System.out.println("    2) �ܾ� ��ȸ");
		System.out.println("    3) �ܾ� ����");
		System.out.println("    4) �ܾ� ����");
		System.out.println("    0) ��       ��");
		System.out.println("====================");
		System.out.print  ("      >> ���� : ");
	}

	@Override
	public int regist(String word, String mean) {
		// ������ �����Ͱ� �����ϴ��� Ȯ��!!!! 
		String tmp = dic.get(word);
		if (tmp == null) {  // ���� �����Ͱ� ���� ��� get() �ϸ� null�� ���ϵȴ�.
			dic.put(word, mean); 
			return 1;
		} 		
		return 0;
	}

	@Override
	public String search(String word) {
		String mean = dic.get(word);
		
		return mean;
	}

	@Override
	public int delete(String word) {
		String tmp = dic.get(word);

		if( tmp != null) {
			tmp = dic.remove(word);
			return 1; // ������ �� ���.
		}
		
		return 0;
	}

	@Override
	public int modify(String word, String mean) {
		// replace�ϱ� �� �� �ܾ �����ϴ��� get()�ؼ� Ȯ���� �� �ؾ���!
		String tmp = dic.get(word);
		if(tmp != null) {
				dic.replace(word, mean); // put() �� ������ ������!
				return 1;
		} 
		
		return 0;
	}

}
