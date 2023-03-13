package java0804;

import java.util.Scanner;

public class Ex_09예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요:");
		
		int num1 = sc.nextInt(); 
		
		
		//기본 시급은 5000원, 8시간이 넘을 경우 시급의 1.5배를 책정
		
		
		
		
		
		
		
	
		
		int result = num1>8 ? 8*5000+(num1-8)*7500: num1*5000;
		
		
		System.out.println("총 임금은 " +result + "원 입니다");
		
  }
}

