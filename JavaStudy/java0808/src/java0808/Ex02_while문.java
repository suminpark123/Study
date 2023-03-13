package java0808;

import java.util.Scanner;

public class Ex02_while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int num =0;
		while(num<1000) {
			System.out.println("정수입력 :");
			num = sc.nextInt();
			
		}
System.out.println("프로그램종료");
	}

}
