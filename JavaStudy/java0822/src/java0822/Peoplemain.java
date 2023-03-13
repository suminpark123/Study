package java0822;

public class Peoplemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객채를 생성하는 공간
		//설계도를 기반으로 객체를 메모리에 할당하는 공간
		// -> instance->클래스의 인스턴스화

		//접근한다. => .(점)을 통해 접근가능
		People st1 = new People();
		st1.name = "박수민";
		st1.age= 20;
		st1.gender = "남";
		
		
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.gender);
		
		
		//필드가 채워지지 않았을때
		//기본 데이터 타입의 경우 =0
		// 참조형 데이터 타입의 경우 = null
	}

}
