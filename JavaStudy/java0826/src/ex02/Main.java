package ex02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal ani = new Animal();
		ani.name = "동물들";	
		ani.eat();
		
		Dog d =new Dog();
		
		d.name = "멍뭉이";
		System.out.println(d.name);
		d.move();
		d.eat();
		d.마킹하다();
		//업캐스팅
		//하위클래스가 상위클래스타입으로 자동변환하는것
		
		Animal ani1 = new Dog();
		
		//객체 내 모든 변수,메소드에 접근x 오직 상위클래스의 
		//변수,메소드에만 접근이 가능하다
		//단, 하위클래스가 상위클래스의 메소드를 오버라이딩한 경우
		//하위 클래스의 메소드를 호출 할 수 있다.
		
		ani1.eat();
		ani1.name = "강아지";
		
		//다운캐스팅 >>업캐스팅된 것을 강제 타입변환으로 되돌림
		//하위클래스가 가지고 있던 기능,데이터를 활용 할 수 있게된다
		
		Dog d1=(Dog) ani1; 
		d1.마킹하다();
		System.out.println(d1.name);
		d1.name ="별이";
		System.out.println(ani1.name);

	}

}
