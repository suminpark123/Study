package java0816알고리즘;

import java.util.Scanner;

public class e22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		
		
		int[] arr=new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 수 입력:");
			arr[i]=sc.nextInt();
		}
		System.out.println("정렬후");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}System.out.print(arr[i]+" ");
		}
		
	}

}
