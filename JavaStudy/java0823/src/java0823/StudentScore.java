package java0823;

public class StudentScore {
	
	private String name;
	private int scorejava;
	private int scoreweb;
	private int scoreandroid;
	private int sum;
	
	public StudentScore(String name, int scorejava, int scoreweb, int scoreandroid, int sum) {
		
		this.name = name;
		this.scorejava = scorejava;
		this.scoreweb = scoreweb;
		this.scoreandroid = scoreandroid;
		this.sum = sum;
		
	}

	
	public String getName() {
		return name;
	}

	public int getScorejava() {
		return scorejava;
	}

	public int getScoreweb() {
		return scoreweb;
	}

	public int getScoreandroid() {
		return scoreandroid;
	}
	
	public int getsum() {
		return scorejava+scoreweb+scoreandroid;
	}
	

}
