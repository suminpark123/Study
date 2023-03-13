package java0816알고리즘;

import java.util.Scanner;

public class e10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);
	
	
	System.out.print("행 개수 :");
	int x = sc.nextInt();
	
	for(int i = 1; i<=x; i++) {
		for(int j=x; j>=i; j--) {
			System.out.print("*");
		}System.out.println();
	}
	
		
		
		
		
		
	}

}
