package java0811;

import java.util.Scanner;

public class Ex10_보충4번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//키보드로 점수입력 후 학점받기
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 :");

		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("A학점");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B학점");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C학점");
		} else {
			System.out.println("재수강");
		}
		sc.close();
	}

}
