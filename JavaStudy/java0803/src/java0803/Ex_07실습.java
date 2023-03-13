package java0803;

import java.util.Scanner;

public class Ex_07실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수입력 : ");
		
		int num = sc.nextInt();
		 
		 System.out.print("두번째 정수입력 : " );
		 int num1 = sc.nextInt();
		
		
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
	}

}
