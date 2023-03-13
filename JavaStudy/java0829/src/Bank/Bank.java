package Bank;

public class Bank {

	//정보은닉을 사용하여 변수 money 타입 int정의
	
	private int money;
	//입금 (deposit)메소드를 구현하라 (매개변수 money) 리턴x
	
	public void deposit(int money) {
		 
		this.money +=money;
	}
	
	//출금(wihtdraw)메소드를 구현하라(매개변수 withdraw) 리턴x
	
	
	public void wihtdraw(int money) {
		this.money -= money;
	}
	//조회(showmoney)메소드를 구현하라(매개변수x)리턴타입 정수형
	public int showmoney() {
		
		
		return money;
	}
	
}
