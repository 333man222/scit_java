import java.util.Map;
import java.util.Scanner;

public class DicServiceImpl implements DicService {
	Map<String, String> dic;
	Scanner keyin = new Scanner(System.in); 
	
	public DicServiceImpl(Map<String, String> dic) {
		this.dic = dic;
		String choice; // 메뉴를 선택했을 때 입력받을 변수
		String word, mean;
		DictionaryVO vo = null;
		int result = 0;
		
		while(true) {
			menu();
			choice = keyin.nextLine();
			
			switch(choice) {
			case "1" : 
				vo = input(); // 입력 전용 메소드
				result = regist(vo.getWord(), vo.getMean());
				if(result == 1) {
					System.out.println("** 등록이 완료되었습니다.");
				} else {
					System.out.println("** 등록이 실패했습니다.");
				}
				break;
				
			case "2" :
				word = inputWord();
				
				mean = search(word);
				if(mean == null)
					System.out.println("** 등록된 단어가 없습니다.");
				else 
					System.out.println("> 찾은 단어 : " + mean);
				break;
			case "3" :
				vo = input();
				
				result = modify(vo.getWord(), vo.getMean());
				if(result == 1) 
					System.out.println("** 수정이 완료되었습니다.");
				else
					System.out.println("** 수정 작업이 완료되지 못했습니다.");
				
				break;
			case "4" :
				word = inputWord();
				
				result = delete(word);
				if(result == 1) 
					System.out.println("** 삭제가 완료되었습니다.");
				else
					System.out.println("** 삭제 못했습니다.");

				break;
				
			case "0" :
				System.out.println("** 프로그램을 종료합니다.");
				return ;
			}
		}
	}
	
	// 단어와 의미를 모두 입력받는 메소드
	private DictionaryVO input() {
		String word = null, mean=null;
		
		System.out.print("> 단어 입력 :"); 
		word = keyin.nextLine();
		System.out.print("> 의미 입력 :"); 
		mean = keyin.nextLine();  // 문장을 입력받음
		
		return new DictionaryVO(word, mean); // VO로 리턴하거나, 배열로 리턴
	}
	// 단어만 입력받는 메소드
	private String inputWord() {
		String word = null;
		
		System.out.print("> 단어 입력 :"); 
		word = keyin.nextLine();
		
		return word; // VO로 리턴하거나, 배열로 리턴
	}

	private void menu() {
		System.out.println("     [ 단어 사전 ] ");
		System.out.println("====================");
		System.out.println("    1) 단어 등록");
		System.out.println("    2) 단어 조회");
		System.out.println("    3) 단어 수정");
		System.out.println("    4) 단어 삭제");
		System.out.println("    0) 종       료");
		System.out.println("====================");
		System.out.print  ("      >> 선택 : ");
	}

	@Override
	public int regist(String word, String mean) {
		// 기존에 데이터가 존재하는지 확인!!!! 
		String tmp = dic.get(word);
		if (tmp == null) {  // 기존 데이터가 없을 경우 get() 하면 null이 리턴된다.
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
			return 1; // 삭제가 된 경우.
		}
		
		return 0;
	}

	@Override
	public int modify(String word, String mean) {
		// replace하기 전 그 단어가 존재하는지 get()해서 확인한 후 해야함!
		String tmp = dic.get(word);
		if(tmp != null) {
				dic.replace(word, mean); // put() 과 동작이 동일함!
				return 1;
		} 
		
		return 0;
	}

}
