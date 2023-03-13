package musicpro;

public class Person {

	//클래스 == 설계도면 ==사람설계

	//1.필드 (데이터 ,속성,변수)
	
	String name;
	int age;
	String gender;
	int height;
	
	
	//main에서 사람을 생성함과 동시에 필드를 초기화시켜주는
	//메소드를 만들어줄수있다.->생성자(Constructor)
	//1.생성자도 메소드이다.
	//2. 리턴타입이 없다. void도 x
	//3.생성자의 이름은 클래스의 이름과 동일
	//4.기본생성자가 클래스에 생략되어있다.
	// ----->만약 우리가 필드를 바로 초기화시키는 생성자를 만들게되면
	//기본생성자의 기능을 잃어버림.
	
	
	
	
//	public Person() {
//		//기본생성자: 생략
//	}
//	

	//기본생성자도 사용하고싶으면
	//기본생성자도 작성해줘야한다.
	//같은 클래스내에서 동일한 이름을 가진 메소드(매개변수가 다른)
	//오버로딩(중복정의)
	
	//오버라이딩(재정의) ->상속
	public Person(String name, int age, String gender, int height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		//this : 현재클래스를 지칭하는 키워드
		//변수는 인접한 곳을 찾아감
		
	}



	//2 .메서드(기능 , 행위)
	//먹고
	public void eat() {
		System.out.println("먹는다 쿰척쿰척");
	}
	//자고
	public void sleep() {
		System.out.println("잔다 쿨쿨");
	}
	//느끼고
	public void feeling() {
		System.out.println("...느낀다...");
	}
	
	
	
	}


