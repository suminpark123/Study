package java0808;

import java.util.Scanner;

public class Ex05_예제무한while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("정수 입력:");
			int num = sc.nextInt();
			if (num%2==0) {
				System.out.println("종료되었습니다.");
				break;
				
			}
		
			
		}

	}

}
