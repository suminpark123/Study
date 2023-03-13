package java0805;

import java.util.Scanner;

public class Ex05_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수선언5개 , 한과목8개 미만 불합격 합산 60이상합격 미만 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB :");
		
		int a = sc.nextInt();
		
		System.out.print("전자계산기 구조: ");
		
		int b = sc.nextInt();
		
		System.out.print("OS :");
		
		int c = sc.nextInt();
		
		System.out.print("데이터 통신 : ");
		
		int d = sc.nextInt();
		
		System.out.print("소프트웨어공학 :");
		
		int e = sc.nextInt();
		
//		if (a+b+c+d+e>=60 &&a>=8 &&b>=8 && c>=8 && d>=8 && e>=8 ) {
//			System.out.println("합격입니다.");
//			
//		}else {
//			System.out.println("불합격입니다.");
//		}
		
		if (a+b+c+d+e<60 ||a<8 ||b<8 || c<8 || d<8 || e<8 ) {
		System.out.println("불합격입니다.");		
		}else {
		System.out.println("합격입니다.");
		}
		
		}
		

	

}
