package java0808;

import java.util.Scanner;

public class Ex03_dowhile문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do-while문: 정확하게 몇 번 반복해야 할지 정해지지 않은경우 사용
		// 무조건 1번은 실행하고 조건식을 검사한다.
		
		//do {
		// 실행문;
		//}while(조건식);
		
		Scanner sc=new Scanner(System.in);
		int num;
		do {
		System.out.println("정수 입력:");
		 num = sc.nextInt();
		}while(num<10);
	}

}
