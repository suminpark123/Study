package ex01;

public class Child extends Parents {
	
	public void bok() {
		System.out.println("야채송송 볶음밥 만들기");
	}

	@Override //->annotation
	public void jja() {
		// TODO Auto-generated method stub
		System.out.println("불짜장 만들기");
	}

	//부모가 가지고있는 기능을 재정의
	
	
	
}
