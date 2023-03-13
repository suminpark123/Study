package java0805;

import java.util.Scanner;

public class Ex01_단순if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if(조건식){ ->조건식의 결과값은 true,false여야함
		//  실행문
		// }
		// 중괄호를 생략할 수 있는 경우 : 실행문장이 1문장일 경우

		//int타입의 변수 age를 선언하고 키보드로 나이를 입력받는다.
		//만약 age가 20보다 크거나 같다면 성인입니다. 를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		
		if (age>=20) {
			System.out.println("성인입니다.");
			System.out.println("미성년자가 아닙니다.");
			
		}
		System.out.println("프로그램 종료");
		
	}

}
