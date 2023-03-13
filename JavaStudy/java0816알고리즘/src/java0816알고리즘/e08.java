package java0816알고리즘;

import java.util.Scanner;

public class e08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("단수입력 : ");
		int a=sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int b=sc.nextInt();
		
		System.out.println(a+"단");
		for(int i = 1; i<=b; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
		
	}

}
