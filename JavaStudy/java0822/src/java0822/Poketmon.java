package java0822;

public class Poketmon {

	String name;
	String type;
	String grade;

	public Poketmon(String name, String type, String grade) {

		this.name = name;
		this.type = type;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// 값을 수정하기 위해서 포켓몬 클래스에서 내/외부로
	// 접근이 가능하도록 메소드 만들어보자.

	// 생성자는 new키워드를 통해서 객체 생성할때 자동호출.
	// 생성자 메소드의 기능 : 만들고자 하는 객체의 옵션을 지정하는 기능.

//	 public Poketmon(String name, String type, String grade){
//		this.name = name;
//		this.type = type;
//		this.grade = grade;
//	
//		}
//	
//	
//	
//	
// public Poketmon(String name, String type) {
//	this.name = name;
//	this.type = type;
//	}
//	

}
