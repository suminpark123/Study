package java0816알고리즘;

import java.util.Scanner;

public class ex12_대시합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >>");
		int a = sc.nextInt();
		
		System.out.println(aa(a));
			
		}
		
			
	
	public static int aa(int a) {
		
		int result =0;
		int [] arr = {6,2,5,5,4,5,6,3,7,6};
		while(a>0) {
			int a2=a%10;
			a/=10;
			
			result +=arr[a2];
		
	} return result;

}	
	}
