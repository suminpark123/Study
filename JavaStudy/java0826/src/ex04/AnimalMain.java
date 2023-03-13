package ex04;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//각각의 대한 객체 생성하기
		//객체 생성 키워드 new
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		System.out.print("dog :");
		dog.eat();
		System.out.print("cat :");
		cat.eat();
		
		
		Animal a = new Animal();
		//클래스의 타입으로 형변환을 진행하기위해서는
		//기본적으로 상속의 개념이 있어야 한다.
		
		//업캐스팅(자동): 자식클래스가 부모클래스 타입으로 형변환
		//강아지(자식)는 동물(부모)이다. > o
		//고양이는 동물이다 >o
		
		Animal a1=new Dog();  //만든건 강아지인데 애니멀타입에 저장
		a1.eat();
		Animal a2=new Cat(); //고양이 대사 불러오기 (다형성)
		a2.eat();
		
		
		//다형성 : 호출되는 객체(Animal)는 동일하지만 
		//실제 만들어진 객체(Dog/Cat)가 다른경우
		
		//다운캐스팅(강제) : 업캐스팅 되어있는 것을 다시 되돌리는것
		//동물은 강아지이다 >x
		//동물은 강아지가 될수 있다.
		
//		Dog d1 =(Dog) new Animal();
//		d1.eat();
		//1.문법적오류
		//2.런타임오류(다운캐스팅이 잘못되었을때,배열의 인덱스 번호가 잘못 됐을때)
		
		Dog d1 =(Dog) a1;
		d1.eat();
	}
	

}
