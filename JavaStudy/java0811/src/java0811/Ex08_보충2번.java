package java0811;

import java.util.Scanner;

public class Ex08_보충2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한 정수를 입력받아 짝수,홀수 구분
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("입력한 정수 : ");
		
		int a =sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+"는 짝수입니다.");
		}
		else if(a%2==1) {
			System.out.println(a+"는 홀수 입니다.");
		}
    sc.close();
	}

}
