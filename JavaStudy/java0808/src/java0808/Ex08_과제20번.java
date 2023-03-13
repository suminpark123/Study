package java0808;

import java.util.Scanner;

public class Ex08_과제20번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("n 입력:");
		
		int x = sc.nextInt();
		
		for(int i=0, j=1; i<x; i++ ) {
			j=j+i;
			System.out.print(j+" ");
		}
		
		
		
	}
}