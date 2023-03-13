package ex01;

public class Main {
	//객체를 생성하는 공간
	//설계도를 기반으로 객체를 메모리에 할당하는것 : 클래스의 인스턴스화
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People sm =new People();
		
		sm.name = "박수민";
		sm.age = 28;
		sm.height = 176.0;
		
		System.out.println(sm.name+"\n"+sm.age+"\n"+sm.height);
		
		//필드가 다 채워지지않았을때
		//기본형 데이터 타입 디폴트값 : 0
		//참조형 데이터타입 : null
		
		//객체지향 프로그래밍 4가지 특징 : 
		//캡슐화 : 외부 접근 및 조작을 대비해서 
		//특정 속성이나 메소드를 사용자가 조작할 수 없도록 "정보은닉
		//상속화 : 상위 클래스에서 특성을 그대로 이어받아 새로운 클래스에서(자식클래스) 생성하는기법
		// 기존코드를 그대로 사용하거나 재정의(오버라이딩)
		//추상화 : 공통의 속성이나 기능을 묶어서 이름을 붙이는 것
		//다형성 : 다양한 형태의 기능을 호출하더라도 객체에 따라서 다르게 동작하는 것
		//상위클래스의 동작을 하위 클래스에서 다시 정의
		
		
		
		
	}

}
