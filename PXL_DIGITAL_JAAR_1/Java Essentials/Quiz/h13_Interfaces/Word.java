package h13_Interfaces;

public class Word implements Measurable{
	private String word;
	
	public Word(String word) {
		this.word = word;
	}
	@Override
	public int measure() {
		return word.length();
	}
	
}
