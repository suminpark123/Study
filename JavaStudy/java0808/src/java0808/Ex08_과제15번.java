package java0808;

import java.util.Scanner;

public class Ex08_과제15번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수:");
		int x =sc.nextInt();
		
		for(int i=0; i<x; i++) {
			for(int j=x; j>i; j--) {
				System.out.print("*");
				
			}System.out.println();
			
		}

	}

}
