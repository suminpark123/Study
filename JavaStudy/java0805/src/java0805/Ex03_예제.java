package java0805;

import java.util.Scanner;

public class Ex03_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//점수합격여부 60점이상 합격/미만 불합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		
		int score = sc.nextInt();
		
		if (score>=60) {
			System.out.println("합격입니다.");
			
			
		}else {
			System.out.println("불합격입니다.");
		}
		
		
		
		
	}

}
