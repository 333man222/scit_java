import java.util.HashMap;
import java.util.Map;

public class DicMain {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		new DicServiceImpl(dic); // DI(Dependency Injection)
	}
}

/*
단어(String), 의미(String)로 구성
Map<String, String> dic = new HashMap<>();

- 등록 (regist) : public int regist(String word, String mean);
- 검색 (search) : public String search(String word);
- 삭제 (delete) : public int delete(String word);
- 수정 (modify) : public int modify(String word, String mean);
==> interface 만든다.
*/



