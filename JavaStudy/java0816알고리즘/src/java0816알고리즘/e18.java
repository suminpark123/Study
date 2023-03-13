package java0816알고리즘;

import java.util.Scanner;

public class e18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[] arr= new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"번째 별의 수 :");
			arr[i] =sc.nextInt();	
		}
		System.out.print(arr[0]+":");
		for(int i=0; i<arr[0]; i++) {
			System.out.print("*");
			
		}
		System.out.print("\n"+arr[1]+":");
		for(int i=0; i<arr[1]; i++) {
			System.out.print("*");
			
		}
		System.out.print("\n"+arr[2]+":");
		for(int i=0; i<arr[2]; i++) {
			System.out.print("*");
			
		}
		System.out.print("\n"+arr[3]+":");
		for(int i=0; i<arr[3]; i++) {
			System.out.print("*");
			
		}
		System.out.print("\n"+arr[4]+":");
		for(int i=0; i<arr[4]; i++) {
			System.out.print("*");
			
		}
		
	}

}
