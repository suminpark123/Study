package java0804;

import java.util.Scanner;

public class Ex_07예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 :");
		
		int num1 = sc.nextInt(); 
		System.out.print("두번째 정수 입력 :");
		
		
		int num2 = sc.nextInt();
		 
		
		
		
		
		
		int result = num1>num2 ? num1-num2 : num2-num1;
		
		
		System.out.println("두수의 차 :" +result);
		
		sc.close();
		
		
		
		
	}

}
