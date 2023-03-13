package ex0;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상화
		//여러 객체에서 공통적으로 사용되는 기능(필드,매소드)등을
		//뽑아 내는 것
		
		Porche po =new Porche();
		
		bugatti bu= new bugatti();
		
		po.runner();
		po.wet();
		po.color ="빨강";
		System.out.println(po.getTire());
		
		bu.runner();
		bu.pilot();
		//Car c = new Car(); 추상클래스는 객체화x
		
		//추상화를 사용하는 이유
		//상속을 통해서 무언가 기능을 구체화하고 싶을때
		//추상화를 사용합니다.
	}

}
