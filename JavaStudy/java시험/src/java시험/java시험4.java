package java시험;

import java.util.Scanner;

public class java시험4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("단 수 입력 :");
		int a=sc.nextInt();
		System.out.print("어느 수까지 출력 :");
		int b=sc.nextInt();
		int c=0;
		System.out.print(a+"단\n");
		
		for(int i = 1; i<=b; i++) {
			c=a*i;
			System.out.println(a+"*"+i+"="+c);
		}
		
	}

}
