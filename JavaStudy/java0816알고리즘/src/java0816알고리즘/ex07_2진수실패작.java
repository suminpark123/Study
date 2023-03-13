package java0816알고리즘;

import java.util.Scanner;

public class ex07_2진수실패작 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		System.out.print("숫자입력:");
		int x = sc.nextInt();
		
		String binaryString = Integer.toBinaryString(x);
		System.out.println(binaryString);
	}
}
	


