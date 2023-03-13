package java0808;

import java.util.Scanner;

public class Ex04_무한while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break : 강제로 반복문을 종료
	Scanner sc=new Scanner(System.in);
	
	while (true) {
		System.out.println("정수입력:");
		int num = sc.nextInt();
		if(num>=10) {
		break;
		}
	}
		System.out.println("반복문종료");
	}

	

}
