package java0816알고리즘;

import java.util.Scanner;

public class e19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("n입력 >>");
		int a=sc.nextInt();
		System.out.print("x입력 >>");
		int b=sc.nextInt();
		
		int[] arr= new int[a];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 정수입력>>");
			arr[i]=sc.nextInt();
			
		}
		System.out.print("결과>>");
		for(int i=0; i<arr.length; i++) {
			if(b>arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
		
		
		
	}

}
