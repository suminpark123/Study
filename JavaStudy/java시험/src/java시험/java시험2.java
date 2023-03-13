package java시험;

import java.util.Scanner;

public class java시험2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.print("나이>>");
		
		int a = sc.nextInt();
		
		if(a>=1 && a<=40) {
			System.out.println("초년입니다.");
		}
		else if(a>40 && a<61) {
			System.out.println("중년입니다.");
		}
		else if(a>60) {
			System.out.println("노년입니다.");
		}
		
	}

}
