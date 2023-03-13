package java0809;

import java.util.Random;
import java.util.Scanner;

public class Ex02_랜덤정수예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤수 만들기
//		Random rd = new Random();
//		
//		
//		int num =rd.nextInt(5)+1;
//		
//		System.out.println(num);
		// 그냥(5) =01234등장/(5)+1 =1~5까지등장

		// 1. n1,n2에 1~10사이의 랜덤수 생성
		// 2. n1,n2 출력하기
		// ex)"13 + 17 ="

		// 3.사용자가 키보드로 정답을 입력!
		// result = 정답 저장
		// 4. 문제를 맞췄을 경우 "Success"
		// 틀렸을 경우 "Fail" 출력

		Random rd = new Random();

		Scanner sc = new Scanner(System.in);

		int num1 = rd.nextInt(10) + 1;

		int num2 = rd.nextInt(10) + 1;
		
	//	while문을 제어할수있는 변수 선언
		boolean check = true;
		
	 
		while (true) {

			System.out.print(num1 + "+" + num2 + "=");

			int result = sc.nextInt();

			if (result == (num1 + num2)) {
				System.out.println("성공");
				num1 = rd.nextInt(10)+1;
				num2 = rd.nextInt(10)+1;
			} else {
				System.out.println("실패");
			}

			System.out.print("게임을 계속 하겠습니까? :");
			String ans = sc.next();
			
			if(ans.equals("y")) {
				check = true;
			}else if(ans.equals("n")) {//equal 문자끼리 같은값비교
				System.out.println("게임 중단");
				check = false;
				
			}
		}

	}

}
