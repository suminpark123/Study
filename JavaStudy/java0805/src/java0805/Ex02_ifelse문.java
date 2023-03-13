package java0805;

import java.util.Scanner;

public class Ex02_ifelse문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if 조건문{
		// 실행문
		// }else{ ->위 조건식이 false였을 때 실행문이 실행
		// 실행문
		// }
		
		//int타입의 변수 age를 선언하고 키보드로 나이를 입력받는다.
		//만약 age가 20보다 크거나 같다면 성인입니다. 를 출력하는 프로그램 작성
		//age가 20보다 작다면 미성년자입니다. 를 출력하는 프로그램 작성
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 :");
		
		
		int age = sc.nextInt();
		
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}

		
		
	}
	
	

}
