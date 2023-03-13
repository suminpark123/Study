package java0819;

import java.util.Arrays;

public class ex02메소드예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 3, 2 };

		int[] sb = strikeBallCounting(array1, array2);
		System.out.println(Arrays.toString(sb));

		
		System.out.println("겜스타트");
		
		
		
	}

	
	private static int[] strikeBallCounting(int[] array1, int[] array2) {
		// TODO Auto-generated method stub

		int[] sb = new int[2];


		for (int i = 0; i < array1.length; i++) {
			for (int k = 0; k < array2.length; k++) {
				if (array1[i] == array2[k]) {
					if(i==k) {
						sb[0]++;
					}else {
						sb[1]++;
						
					}
				}
			}
		}

		return sb;

	}
}


