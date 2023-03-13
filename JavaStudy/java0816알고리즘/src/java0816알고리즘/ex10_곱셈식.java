package java0816알고리즘;

import java.util.Scanner;

public class ex10_곱셈식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력>>");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int b = sc.nextInt();
		
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100-b%10)/10);
		System.out.println(a*(b/100));
		System.out.println(a*b);

	}

}
