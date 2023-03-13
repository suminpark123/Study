package java0816알고리즘;

import java.util.Scanner;

public class e02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("일할시간 입력: ");
		int t =sc.nextInt();
		int x = 8;
		
		if(t<=8) {
			
			System.out.println("총 임금은"+5000*t);
			
		}
		else if(t>8) {
		
			System.out.println("총 임금은"+(5000*x+7500*(t-8)));
			
		}		
		
		
	}

}
