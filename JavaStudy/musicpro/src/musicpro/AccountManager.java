package musicpro;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;
	Scanner sc = new Scanner(System.in);
	
	public AccountManager() {
		list = new ArrayList<Account>();
	}
	
	public void makeAccount() { //계좌개설
		Account account = new Account();
		System.out.print("계좌번호 : ");
		account.setId(sc.nextInt());
		
		System.out.print("이름 : ");
		account.setName(sc.next());
		
		System.out.print("입금액 : ");
		account.setBalance(sc.nextInt());
		
		list.add(account);
		System.out.println("계좌가 개설됨.");
		System.out.println(list.toString() + "\t");
		
	}
		public void deposit() {
			System.out.print("계좌번호 : ");
			int id = sc.nextInt();
			System.out.print("입금액 : ");
			int money = sc.nextInt();
			
			for(int i = 0; i < list.size(); i++) {
				Account account = list.get(i);
				
				if(account.getId()==id) {
					int balance = account.getBalance();
					money += balance;
					
					account.setBalance(money);
					System.out.println("입금 확인 완료");
					return;
				}
			}
			System.out.println("해당 계좌 번호가 존재하지 않습니다.");
		}
		
		public void withdraw() { //출금
			System.out.print("계좌번호 : ");
			int id = sc.nextInt();
			System.out.print("출금액 : ");
			int money = sc.nextInt();
			
			for(int i = 0; i < list.size(); i++) {
				Account account = list.get(i);
				
				if(account.getId()==id) {
					if(account.getBalance() < money ) {
						System.out.print("잔액 부족");
						return;
					} else {
						int balance = account.getBalance();					
						money = balance - money;
					account.setBalance(money);
					System.out.println("출금 확인 완료");
					return;
				}
			}
		}
			System.out.println("해당 계좌 번호가 존재하지 않습니다.");
	
}
		public void inquire() { //잔액 조회
			System.out.print("계좌번호 : ");
			int id = sc.nextInt();
			
			for(int i = 0; i < list.size(); i++) {
				Account account = list.get(i);
				
				if(account.getId()==id) {
					System.out.println(account.getId() + "\t" + account.getName() + "\t" +
					+ account.getBalance() + "\t");
					return;
						
				}
			}
			System.out.println("해당 계좌 번호가 존재하지 않습니다.");
		}
		
		public void disp () {
			for(int i = 0; i < list.size(); i++) {
				Account account = list.get(i);
				System.out.println(account.getId() + "\t" + account.getName() + "\t" +
						+ account.getBalance() + "\t");
			
	}
		}
}
