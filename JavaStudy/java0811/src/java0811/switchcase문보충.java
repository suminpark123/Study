package java0811;

import java.util.Scanner;

public class switchcase문보충 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.print("몇월인가요 :");
		int month=sc.nextInt();
		
		
		switch (month) {
		case 2,1,12:
			System.out.println("겨울");
			break;
		
		case 3,4,5:
			System.out.println("봄");
			break;
	
		case 6,7,8:
			System.out.println("여름");
			break;
		
		case 9,10,11:
			System.out.println("가을");
			break;		
			

		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		
	}

}
