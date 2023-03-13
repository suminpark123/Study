package java0816알고리즘;

import java.util.Scanner;

public class ex11_팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			
			
			System.out.print("입력 : ");
			int a= sc.nextInt();
		
			int x=1;
			
			for(int i=1; i<=a; i++) {
				x*=i;
				
			}
			System.out.println("출력 : "+x);
		
		
	}

}
