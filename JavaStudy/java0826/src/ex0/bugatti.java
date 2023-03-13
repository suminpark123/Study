package ex0;

public class bugatti extends Car {

	
	//부모클래스에서 자식클래스로 상속받았을때
	//기능을 재정의 : 오버라이딩
	
	
	
	 @Override
	public void runner() {
		System.out.println("기어봉이 있습니다.");
	}
	
	public void pilot() {
		System.out.println("자율주행");
	}
	
	
}
