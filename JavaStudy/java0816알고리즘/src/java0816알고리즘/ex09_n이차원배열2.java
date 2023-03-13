package java0816알고리즘;

import java.util.Scanner;

public class ex09_n이차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("정수입력");
		int x=sc.nextInt();
		int[][] arr= new int[x][x];
		int a=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i%2==0) {
				 arr[i][j]=a++;
				 //System.out.print(arr[i][j]+"\t");
				}else {				
					arr[i][(arr[i].length-1)-j]=a++;
					//System.out.print(arr[i][j]+"\t");
				}			
			}//System.out.println();
			}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
			
		}

}