package java0811;

import java.util.Scanner;

public class Ex06_배열복습3번총합평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
	
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + "번째 입력>>");
			arr[i] = sc.nextInt();

		}
		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("입력된 점수: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

			sum = sum + arr[i];
			avg = sum / arr.length;

		}
		System.out.println();
		System.out.print("최고점수:");
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				
			}

		}System.out.print(max);
		System.out.println();
		System.out.print("최저점수:");
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}
		}
		System.out.println(min);
		System.out.println("총합:" + sum);
		System.out.print("평균:" + avg);

	}

}
