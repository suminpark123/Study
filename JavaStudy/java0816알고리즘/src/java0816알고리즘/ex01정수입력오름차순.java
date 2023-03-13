package java0816알고리즘;

import java.util.Scanner;

public class ex01정수입력오름차순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr =new int[5];
	
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			arr[i]=sc.nextInt();
			
			
			//버블정렬
			
		}
		int min = arr[0];
		System.out.print("정렬 후\n");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			//	System.out.print(arr[i]);
			}
				
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
