package java0811;

import java.util.Scanner;

public class Ex09_보충3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//한 정수를 입력받아 1의자리에서 반올림 한 값 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자 입력:" );
		int i=sc.nextInt();
	
		
		int x=i/10;
				
		System.out.println("반올림 수 :"+x+"0");
		
		
		
		sc.close();
	}

}
