package java0822;

public class piggybankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		piggybank suminbank = new piggybank();
		suminbank.showmoney();
		suminbank.deposit(3000);
		suminbank.showmoney();
		suminbank.deposit(2000);
		suminbank.showmoney();
		suminbank.withdraw(4500);
		suminbank.showmoney();
		
		piggybank temp = suminbank;
		
	}

}
