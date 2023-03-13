package java0809;

import java.util.Scanner;

public class 다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("현재 몸무게:");
		int now =sc.nextInt();
		
		System.out.print("목표 몸무게:");
		int goal = sc.nextInt();
		
		int week = 1;
		
		while (now>goal) {
				System.out.print(week+"주차 감량 몸무게 :");
				int kg = sc.nextInt();
				
				now -= kg;// now = now -kg;
				week++;
		}System.out.println(now+"kg 달성! 축하");
	}

}
