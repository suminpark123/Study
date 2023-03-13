package java0816알고리즘;

import java.util.Scanner;

public class e09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("행 개수 :");
		int x = sc.nextInt();
		
		for(int i =0; i<x; i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		

	}

}
