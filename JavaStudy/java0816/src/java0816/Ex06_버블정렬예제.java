package java0816;

public class Ex06_버블정렬예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 39, 60, 25, 36, 17, 14, 13, 74, 88, 75 };
		int tmp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {// -i의 의미:이미정렬한값은 빼고 포문
				// 중복제외
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}