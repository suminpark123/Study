package java0808;

import java.util.Scanner;

public class Ex07_과제2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("일할시간을 입력하세요 :");
		
		int t =sc.nextInt();
		
		int a = 5000*t;
		
		int b = 5000*8+7500*(t-8);
		if (t<=8) {
			System.out.println("총 임금은"+a+"원 입니다.");
		}else 
			System.out.println("총 임금은"+b+"원 입니다.");
		}
		
		
		

	}
