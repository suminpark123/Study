package java0808;

import java.util.Scanner;

public class Ex08_과제23번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int x = 0; x < arr.length; x++) {
			System.out.print(x + "번째 별의 수 : ");
			arr[x] = sc.nextInt();

		}

		System.out.print(arr[0] + ": ");
		for (int i = 1; i <= arr[0]; i++) {
			System.out.print("*");

		}
		System.out.println();
		System.out.print(arr[1] + ": ");
		for (int j = 1; j <= arr[1]; j++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(arr[2] + ": ");
		for (int k = 1; k <= arr[2]; k++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(arr[3] + ": ");
		for (int l = 1; l <= arr[3]; l++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(arr[4] + ": ");
		for (int m = 1; m <= arr[4]; m++) {
			System.out.print("*");
		}
sc.close();
	}

}
