package java0823;

public class White {
	private String name;
	private int age;
	
	//필드
	
	//생성자 : 객체를 생성하는 것
	//접근제한자 white(매개변수){}
	
	public White(String name , int age) {
		this.name=name;
		this.age =age;
	}
	public White() {   //생성자 오버로딩-중복정의 -디폴트 생성자
		
	}   
	
	
	
	
	//객체를 만들기 위한 설계도 파트.
	//메인 : 객체를 실제로 만드는 파트.
	//배열의 구조
	//데이터 타입(int, double) [] 배열의 이름 =new 데이터타입 [배열의 크기];
	//배열의 한계점 : 배열의 크기 고정되어 있어서
	//데이터 추가같은 유지보수에서 한계점.
	//ArrayList : 배열의 크기가 자동으로 변경되는 가변 리스트.
	//자료 구조 : 데이터들을 정리 할 수 있는 구조들 (스택, 큐,배열,트리)
	//ArrayList 생성
	//ArrayList<참조변수타입> 이름 = new ArrayList<타입>();
	//타입을 지정했을때 객체의 타입만 가능.
	//문자열 형태:<String> // 정수형 형태 : <Integer> int x
	//ArrayList에 값을 추가하는 메소드 : .add
	//ArrayList에 값을 조회하는 메소드 : .get
	//배열의 길이 : length. , ArrayList 크기를 알고 싶을때 : size()
	//필드 :클래스의 전역변수 : 객체의속성을 정의하는곳
	//Person 이름,나이
	//전역변수 : 접근제한자(지정자)
	//
	
	
	
}
