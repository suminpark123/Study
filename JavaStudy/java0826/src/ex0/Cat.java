package ex0;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
	//Cat 생성자는
	//"포유류" 값으로 초기화
	//매개변수는 없다
	//sound 메소드를재정의
	//야옹이라고 출력

}
