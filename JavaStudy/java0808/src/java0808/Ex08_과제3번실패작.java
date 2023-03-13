package java0808;

import java.util.Scanner;

public class Ex08_과제3번실패작 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 :");
		
		int a = sc.nextInt();//현재
		
		System.out.print("목표 몸무게 :");
			
		int b = sc.nextInt();//목표
		
		int w = 1;
	
		while (true) {
			
			int num;
			int c;
			
			System.out.print(w+"주차 감량 몸무게 :");
			w++;
			num = sc.nextInt();
			c= a-num;
			
			if(a<=b || a-num<=b) {
				
				System.out.println(b+"kg 달성!! 축하합니다!");
				break;
			}
			
		}
				
			
			
			}
				

	}

