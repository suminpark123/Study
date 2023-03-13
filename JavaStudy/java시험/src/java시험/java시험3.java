package java시험;

public class java시험3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 101; i++) {

			if (i % 2 == 1) {
				System.out.print(i + " ");

			} else {
				System.out.print("-" + i + " ");
			}

		}
		System.out.print("\n결과 : ");
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i < 101; i++) {

			if (i % 2 == 1) {
				sum1 += i;

			} else {
				sum2 -= i;

			}

		}
		System.out.print(sum1 + sum2);

	}

}
