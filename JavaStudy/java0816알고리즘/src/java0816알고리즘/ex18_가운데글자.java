package java0816알고리즘;

import java.util.Scanner;

public class ex18_가운데글자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMiddle("power"));
		
		
	}

	private static char[] getMiddle(String n) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("단어입력>>");
		 String a =sc.next();
		char []arr = new char[a.length()];
		
		char result =' ';
		if(a.length()%2==1) {
			result =  n.charAt(1);
		}
		
		
		
		
		return arr;
	}

}
