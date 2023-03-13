package java0808;

import java.util.Random;

public class Ex08_과제21번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();

		int[] arr = new int[8];

		System.out.print("배열에 있는 모든값 :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;

			System.out.print(arr[i] + " ");
		}

		System.out.print("\n가장 큰 값:");

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}

		}
		System.out.print(max);
		System.out.print("\n가장 작은 값:");

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(min);

	}

}
