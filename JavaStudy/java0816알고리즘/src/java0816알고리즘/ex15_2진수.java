package java0816알고리즘;

import java.util.Scanner;

public class ex15_2진수 {

	public static void main(String[] args) {
		String str="01001101";
		System.out.print(str+"(2) = ");
		String[] arr= str.split("");
		
		int result1=1;
		int result2=0;
		for(int i=arr.length-1; i>=0; i--) {
			result2+=Integer.parseInt(arr[i])*result1;
			result1*=2;
		}
		System.out.print(result2+"(10)");
	}

}
