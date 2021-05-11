import java.util.HashMap;
import java.util.Map;

public class DicMain {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		new DicServiceImpl(dic); // DI(Dependency Injection)
	}
}

/*
�ܾ�(String), �ǹ�(String)�� ����
Map<String, String> dic = new HashMap<>();

- ��� (regist) : public int regist(String word, String mean);
- �˻� (search) : public String search(String word);
- ���� (delete) : public int delete(String word);
- ���� (modify) : public int modify(String word, String mean);
==> interface �����.
*/



