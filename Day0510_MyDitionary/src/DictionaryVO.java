
public class DictionaryVO {
	private String word;
	private String mean;
	public DictionaryVO(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public String getMean() {
		return mean;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return "DictionaryVO [word=" + word + ", mean=" + mean + "]";
	}
	
	
}
