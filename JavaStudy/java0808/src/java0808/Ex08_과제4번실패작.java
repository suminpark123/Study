package java0808;

import java.util.Scanner;

public class Ex08_과제4번실패작 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		
		if (a==b && b==0 && a==0) {
			
		  a= 0;
		  b= 0;
			System.out.println("종료");
		
		
		 
		}else if (a!=0 || b!=0) {
			
			System.out.print("A 입력>>");
			 a = sc.nextInt();
			
			System.out.print("B 입력>>");
			 b = sc.nextInt();
			 
			 System.out.println("결과>>"+(a-b));
			 
			
			
			
			
		}
		
		
	}
		
}

