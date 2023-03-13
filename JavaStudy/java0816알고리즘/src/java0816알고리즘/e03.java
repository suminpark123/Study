package java0816알고리즘;

import java.util.Scanner;

public class e03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("현재몸무게");
		int a = sc.nextInt();
		System.out.println("목표몸무게");
		int b = sc.nextInt();
		
		
		for(int i =1; i<100; i++ ) {
			
			System.out.print(i+"주차 감량몸무게");
			int c= sc.nextInt();
			a-=c;
			if(a<=b) {
				System.out.println(a+"달성");
				break;
			}
		}
		
	}

}
