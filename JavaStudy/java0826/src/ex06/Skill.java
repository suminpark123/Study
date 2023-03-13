package ex06;

public interface Skill {

	//interface는 클래스가 아니다.
	// new 키워드로 객체생성 불가능.
	//인터페이스 안에 변수들은 전부 상수 지정된다.
	// final 키워드 생략 할 수가 있습니다.
	
	public final String server = "스카니아";
	public abstract void attack();
	public abstract void run();
	//abstract 키워드가 생략되어도 자동적으로 추상메소드로 인지
	
	
	
}
