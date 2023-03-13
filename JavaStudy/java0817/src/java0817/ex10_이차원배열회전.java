package java0817;

public class ex10_이차원배열회전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5][5];

		int x = 1;
		System.out.println("원본");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = x++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("90도 회전");
		
		int y= 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[j][i] = y++;

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
