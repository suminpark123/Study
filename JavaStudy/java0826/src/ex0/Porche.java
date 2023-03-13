package ex0;

public class Porche extends Car {

	
	//일반 클래스에서 부모클래스를 물려받았을때
	//부모의 기능을 사용하거나 or 사용하지 않거나 결정할수있다.
	
	//물려받는 추상메소드에 대해서
	//구체적인 기능을 구현해줘야 하는데
	//추상클래스를 물려 받는 경우에는 부모로부터 지정되어 있는
	//메소드를 반드시 오버라이딩 해야 합니다.
	
	
	
	@Override
	public void runner() {
		// TODO Auto-generated method stub
		System.out.println("코너링 굿.");
		
		
	}
	public void wet() {
		System.out.println("도로젖은상태 : 최적화 중");
	}
	
	
	
	
	
}
