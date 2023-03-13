package ex05;

public class Machine {

	//인형 뽑기 기계
	//machine의 기능은 다양한 인형을 뽑을수 있도록 한다.
	
//	public void pic(Pika p) {
//		p.pika();
//	}
	
	//새로운 인형이 추가될 경우 pic이라고 하는 기능 중복적으로 사용하기
	//메소드의 이름은 같아야 하고, 재료값인 인형이 달라진다.
	//>매개변수의 타입이 달라지는 메소드 오버로딩(중복정의)
//	public void pic(Pairi p) {
//		p.pairi();
//	}
	
//	public void pic(Kkobuk k) {
//		k.kkobuk();
//	}
	
//}
	
   //	여러 인형들을 하나의 메소드를 통하여 사용할수 있도록 만들어보자
	// 매개 변수 > 무조건 공통되는 하나의 재료값만 들어온다

	public void pic(Doll d) {
	d.doll();
	}
}
	