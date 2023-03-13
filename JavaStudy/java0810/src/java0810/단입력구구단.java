package java0810;

import java.util.Scanner;

public class 단입력구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("단 입력 :");
		
		int x=sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(x+"*"+i+"="+x*i);
		}
	}

}
