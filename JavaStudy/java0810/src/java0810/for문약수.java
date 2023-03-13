package java0810;

import java.util.Scanner;

public class for문약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a =sc.nextInt();
		
		System.out.print(a+"의 약수 :");
		for(int i =1; i<=a; i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}
		

	}

}
