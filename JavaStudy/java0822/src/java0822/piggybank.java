package java0822;

public class piggybank {

	

		private int money;
		
		public void deposit(int m) {
			money+=m;
		}
		
		public void withdraw(int m) {
			money-=m;
		}
		
		public void showmoney() {
			System.out.println("잔액 : "+money);
		}

}
