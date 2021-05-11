
public interface DicService {
	public int regist(String word, String mean);
	public String search(String word);
	public int delete(String word);
	public int modify(String word, String mean);
}
