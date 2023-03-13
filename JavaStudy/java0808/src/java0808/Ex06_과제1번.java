package java0808;

import java.util.Scanner;

public class Ex06_과제1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 :");
		
		int change = sc.nextInt();
		
		
		System.out.println("잔돈 :"+ change +"원");
		int c10000 = change/10000;
		int c5000  = change%10000/5000;
		int c1000  = change%10000%5000/1000;
		int c500   = change%10000%5000%1000/500;
		int c100   = change%10000%5000%1000%500/100;
		
		System.out.println("10000원 :"+c10000+"개");
		System.out.println("5000원 :"+c5000+"개");
		System.out.println("1000원 :"+c1000+"개");
		System.out.println("500원 :"+c500+"개");
		System.out.println("100원 :"+c100+"개");
		
		
		
		

	}

}
