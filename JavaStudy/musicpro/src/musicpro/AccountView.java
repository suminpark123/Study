package musicpro;

import java.util.Scanner;

public class AccountView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		AccountManager manager =new AccountManager();
		
		while(true) {
			printMenu();
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				manager.makeAccount();
				break;
			case 2:
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4:
				manager.inquire();
				break;	
			case 5:
				manager.disp();
				break;
			case 6:
				System.out.print("종료!");
				return;
				
			default:
				System.out.println("다시 누르세요");
				break;
			}
			
		}		
	}

	public static void printMenu() {
		System.out.println("====Menu====");
		System.out.println("1.계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 출력");
		System.out.println("6. 종료");
		System.out.println();
		
	}
	
	
}
