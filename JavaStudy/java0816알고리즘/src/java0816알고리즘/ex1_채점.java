package java0816알고리즘;

import java.util.Scanner;

public class ex1_채점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("====채점하기====\n");
		
		String a =sc.next();
		int s =0;
		int c =1;
		
		for(int i = 0; i<a.length(); i++) {
			switch(a.charAt(i)) {
			
			case'o':s+=(c++);
			break;
			case'x':s+=0;
			c=1;
			break;
			}
		}System.out.println(s);
		
		
	}

}
