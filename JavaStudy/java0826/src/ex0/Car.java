package ex0;

public abstract class Car {
	
	//추상클래스 > abstract 키워드사용
	//추상클래스는 반드시 하나 이상의 (추상메소드)를 포함하고있어야된다.
	
	
	public abstract void runner();
	//추상 메소드.기능 : 운전하는 기능
	//중괄호 x
	//구체적인 내용 가질수x
	//>로직이나 기능을 설정x
	
	int tire = 4;
	String color;
	
	public int getTire() { //타이어 갯수확인
		return tire;
	}
	
}
