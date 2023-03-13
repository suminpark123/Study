package java0816알고리즘;

import java.util.Scanner;

public class e13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int x = sc.nextInt();
		int n = 0;
		int sum=0;
		
	for(int i=x; i>0; i/=10) {
		sum+=i%10;
		
	}
	System.out.print(sum);
		
	}

}
