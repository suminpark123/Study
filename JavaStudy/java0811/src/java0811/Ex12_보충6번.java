package java0811;

import java.util.Scanner;

public class Ex12_보충6번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		

		int sum=0;
		while (true) {
			System.out.print("숫자입력 :");
			int x =sc.nextInt();
			System.out.print("누적결과 :");
			sum=sum+x;
			System.out.println(sum);
		if(x==-1) {
		break;
		}
		
		
	}	
		System.out.println("종료되었습니다.");
		

	}

}

