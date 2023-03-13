package java0816알고리즘;

import java.util.Scanner;

public class e05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("a입력>");
			int a = sc.nextInt();
			System.out.println("b입력>");
			int b = sc.nextInt();
			
			
		
			if(a==0 &&b==0) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("결과>"+(a-b));
			}
		}
		
		
	}

}
