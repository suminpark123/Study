package java0808;

import java.util.Scanner;

public class Ex08_과제3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 :");
		
		int a = sc.nextInt();
		
		System.out.print("목표 몸무게 :");
			
		int b = sc.nextInt();
		
		int w =1;
		
		int d=0;
		
		int c=0;
		
		while (b<=a-c) {
			
			
			System.out.print(w+"주차 감량 몸무게 :");
			 c =sc.nextInt();
			
		    a =a-c;
		 w++;
			
		}
				
				System.out.println(a+"kg 달성!! 축하합니다!");
						
			
		}
			
			
}
		
		

	


