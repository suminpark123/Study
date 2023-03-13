package java0808;

import java.util.Scanner;

public class Ex08_과제18a번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("입력");
		int num = sc.nextInt();
		int sum = 0;

		while (num != 0 ) {
			sum += num % 10;
			num /= 10;

		}

		System.out.println(sum + "입니다.");
	}

}
