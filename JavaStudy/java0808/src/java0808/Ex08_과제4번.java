package java0808;

import java.util.Scanner;

public class Ex08_과제4번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("A 입력>>");
			int a = sc.nextInt();
			System.out.print("B 입력>>");
			int b = sc.nextInt();
			
			
			System.out.println("결과>>"+(a-b));
			if(a==0 && b==0) {
				System.out.println("프로그램 종료");
				break;
				
				
			}
				
				
			
			
			
		}
	}

}
