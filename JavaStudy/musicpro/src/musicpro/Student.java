package musicpro;

public class Student {

	// 이 부분은 Student 클래스의 모델 파트입니다.
	// 접근 지정자가 private 타입
	// 타입 : String
	// 변수는 두가지(학번과 이름)	단, 변수 이름은 rollNo(학번) name(이름)!!
	// Getter, Setter 만들어주세요
	// 생성자는 디폴트 생성자, 2개의 매개변수를 가진 생성자를 만들어 주세요
	
	private String rollNo;//학번
	private String name;//이름

	
	public Student() {
		
	}
	
	
	public Student(String rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
