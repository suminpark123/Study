package ex0;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		
		animal =new Dog();
		animal.sound();
		
		animal =new Cat();//자동 타입변환 o
		animal.sound(); // Cat에 구현된 sound()메소드 실행.
		
		animalsound(new Dog());
		animalsound(new Cat());
		//sound() 추상메소드는 cat실체클래스에 맞게끔 구현이 되어있다.ㅣ
		//여기서 오버라이딩을 하게된다면 "다형성" 발생합니다.
		//다형성 :상위클래스가 동일한 메시지로 하위 클래스들을 서로 다르게 동작
		//규격에 맞게끔 필드명과 메소드명이 통일되어있습니다.
		
		
		
		
	}

		private static void animalsound(Animal animal) {
			animal.sound();
		}
}
