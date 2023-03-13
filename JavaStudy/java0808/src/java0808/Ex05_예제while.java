package java0808;

import java.util.Scanner;

public class Ex05_예제while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num = 1;
		while (num%2==1) {
			System.out.println("정수입력 :");
			num = sc.nextInt();
			
		}
System.out.println("프로그램종료");
	}

}

		