package java시험;

import java.util.Scanner;

public class java시험5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int x = sc.nextInt();

		int sum = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;

		for (int a = 10000000; a >= 1; a /= 10) {

			if (a == 10000000) {
				b = x / a;
				// System.out.println(b);
			} else if (a == 1000000) {
				c = x % 10000000 / a;
				// System.out.println(c);
			} else if (a == 100000) {
				d = x % 10000000 % 1000000 / a;
				// System.out.println(d);
			} else if (a == 10000) {
				e = x % 10000000 % 1000000 % 100000 / a;
				// System.out.println(e);
			} else if (a == 1000) {
				f = x % 10000000 % 1000000 % 100000 % 10000 / a;
				// System.out.println(f);
			} else if (a == 100) {
				g = x % 10000000 % 1000000 % 100000 % 10000 % 1000 / a;
				// System.out.println(g);
			} else if (a == 10) {
				h = x % 10000000 % 1000000 % 100000 % 10000 % 1000 % 100 / a;
				// System.out.println(h);
			} else if (a == 1) {
				i = x % 10000000 % 1000000 % 100000 % 10000 % 1000 % 100 % 10 / a;
				// System.out.println(i);
			}
			sum = b + c + d + e + f + g + h + i;
			sc.close();
		}
		System.out.println("각 자리수의 합 :" + sum);

	}

}