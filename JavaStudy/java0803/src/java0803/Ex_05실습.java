package java0803;

import java.util.Scanner;

public class Ex_05실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제정의) 사용자가 Scanner를 통해 숫자를 입력하면
		//        해당하는 숫자에 대하여 백의자리 이하 버리는 수 구하기
		
		//Scanner 기능 불러오기 -> import 필수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수입력 : ");
		
		
		
		// sc를 통해 입력 값 받기
		
		//sc.nextInt() 입력값 직접받기 스캐너
		
		
		 int num = sc.nextInt();
		 
		 System.out.print("두번째 정수입력 : " );
		 int num1 = sc.nextInt();
		//1. num이 가지고 있는 백의 자리 수 구하기
		
		
		//int result = num/100;
		
		//2 . 나머지 자리값 버리기
		//456 ->400
		
		//result = result *100;
		//System.out.println("결과확인 : " + result+ "00");
		 
		 int a = num+num1;
		 int b = num-num1;
		 int c = num*num1;
		 int d = num/num1;
		 
		 
		 
		 
				 
		//System.out.println(num);
		//System.out.println(num1);
		
		System.out.println("두수의 더하기 : "+a);
		System.out.println("두수의 빼기 : "+b);
		System.out.println("두수의 곱하기 : "+c);
		System.out.println("두수의 나누기 : "+d);
	
		// 정수형 입력 명령 : sc.nextInt();
		// 문자형 입력 명령 : sc.next();
		// 실수형 입력 명령 " sc.nextDouble();
		
		
		

	}

}
