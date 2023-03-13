package java0808;

import java.util.Scanner;

public class Ex08_과제14번 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("행 개수:");
		int x=sc.nextInt();
		
		for(int i =1; i<=x; i++) {
				
			for(int j= 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
