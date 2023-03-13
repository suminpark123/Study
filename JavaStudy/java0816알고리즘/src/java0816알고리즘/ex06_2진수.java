package java0816알고리즘;

import java.util.Scanner;

public class ex06_2진수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		
		int a=sc.nextInt();
		
		int[] arr= new int[11];
		int i=0;
		
		while(a>0) {
		arr[i]=a%2;
			a/=2;
			i++;
			
		}
		i--;
		
		for(arr[i]=arr.length-10; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
