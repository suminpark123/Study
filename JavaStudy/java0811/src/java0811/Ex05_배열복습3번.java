package java0811;

import java.util.Scanner;

public class Ex05_배열복습3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[] arr =new int[10];
		int x =1;
		
		
		for(int i=0; i<arr.length; i++) {
		 System.out.print(x+"번 째 정수 입력>> ");
		 x++;
		 arr[i]=sc.nextInt();
	
			 
		 }
		 System.out.print("3의배수 :");
		//System.out.print("3의 배수 :"+arr[i]);
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
				
			}
		}
			
		}

	}


