package ex0;

public class Dog extends Animal {
	
	//Animal를 상속받습니다.
	public Dog() {
	this.kind = "포유류";
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("왈왈");
	}
	
	
	       
	//Dog 생성자는
	//"포유류" 값으로 초기화
	//매개변수 x
	
	//sound 메소드를 재정의하여
	//왈왈이라고 출력
	
	

}
