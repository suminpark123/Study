package java0805;

import java.util.Scanner;

public class Ex04_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수입력 홀짝
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println(num +"는(은) 짝수입니다.");
			
			
			
		}else {
			System.out.println(num + "는(은) 홀수입니다");
		}

	}

}
