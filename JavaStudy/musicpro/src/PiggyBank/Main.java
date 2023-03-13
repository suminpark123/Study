package PiggyBank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//설계도가 실행되는공간
		//설계도로 객체생성
		
		piggyBank bank = new piggyBank("정세연", 50000);
		
//		System.out.println(bank.name);
//		System.out.println(bank.money);
//지금 현재 필드는 private때문에 직접접근불가
		
		//piggybank에 있는 get/set를 통해 접근가능
		System.out.println(bank.getName());
		System.out.println(bank.getmoney());
		
		//3천원 인출
		System.out.println(bank.withdraw(3000));
		
		bank.showmoney();
		System.out.println(bank.deposit(5000));
		bank.showmoney();
	}

}
