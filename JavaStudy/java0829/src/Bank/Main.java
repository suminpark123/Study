package Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bank1 bank2 객체생성
		
		Bank bank1 = new Bank();
		Bank bank2 = new Bank();
		
		
		//money 5만원 입금
		bank1.deposit(50000);
		System.out.println(bank1.showmoney());
		//money 3만원 출금
		bank1.wihtdraw(30000);
		System.out.println(bank1.showmoney());
		//잔액 보여주기
		
		System.out.println(bank1.showmoney());
		
		
	}

}
