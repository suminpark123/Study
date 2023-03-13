package java0816알고리즘;

import java.util.Scanner;

public class e01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		
		int m = sc.nextInt();
		
		System.out.println("잔돈 :"+m);
		System.out.println("만원:"+m/10000);
		System.out.println("천원:"+m%10000/5000);
		System.out.println("천원:"+m%10000%5000/1000);
		System.out.println("천원:"+m%10000%5000%1000/500);
		System.out.println("천원:"+m%10000%5000%1000%500/100);
		
		
	}

}
