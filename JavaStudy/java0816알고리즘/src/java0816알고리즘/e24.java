package java0816알고리즘;

import java.util.Scanner;

public class e24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		
		
		int[][] arr = new int [100][100];
		
		System.out.println("정수입력");
		int x = sc.nextInt();
		
		int y= 1;
		
		for(int i=0; i<x; i++) {
			for(int j =0; j<x; j++ ) {
				arr[j][i]=y++;
			}
		}
		for(int i=0; i<x; i++) {
			for(int j =0; j<x; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
