package java0808;

import java.util.Scanner;

public class Ex01_과제자판기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력 :");
		int inputmoney = sc.nextInt();
		System.out.println("메뉴를 골라");
		System.out.println("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)");
		int menu = sc.nextInt();
		
		int price=0;
		
		if(menu ==1) {
			 price = 800;
		}else if (menu ==2) {
			price = 500;
		}else if (menu ==3) {
			price = 1500;
		}
		
		
		int change = 0;
		if (inputmoney < price) {
			System.out.println("금액이 부족합니다.");
			change=inputmoney;
		}else {
			change = inputmoney-price;
		}
		System.out.println("잔돈:"+change+"원");
		int c1000 = change/1000;
		int c500 = change%1000/500;
		int c100 = change%500/100;
		System.out.println("천원 :"+c1000);
		System.out.println("오백원 :"+c500);
		System.out.println("백원 :"+c100);
	}

}
