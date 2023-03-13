package ex0;

public abstract class Animal {
	//접근제한자 :퍼블릭
	//타입 : 스트링
	//변수명 kind 타입 
	public String kind;
	 
	
	public void breath() {
		System.out.println("숨쉬어숨");
	}
	public abstract void sound();
	//breath() 라는 메소드
	//접근제한자 퍼블릭
	//리턴 타입 void
	//실행문장 : 숨쉬어숨
	//추상메소드도 만들고
	//메소드명 sound
	
}
