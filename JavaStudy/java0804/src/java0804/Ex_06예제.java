package java0804;

import java.util.Scanner;

public class Ex_06예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		
		int num = sc.nextInt(); 
		
		
		
		
		//String result = num%2==0 ? "짝수" :"홀수";
		
		System.out.print( num %2==0 ? num +"는 (은) 짝수입니다." : num + "는 (은) 홀수입니다.");
		
		
		
		
		
	}

}
