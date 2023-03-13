package java0816알고리즘;

import java.util.Random;
import java.util.Scanner;

public class e04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Random rd = new Random();

		
		int x = 0;
				
		while(true) {
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);
			System.out.println(a+"+"+b+"=");
			int c=	sc.nextInt();
			if(a+b==c) {
				System.out.println("성공!");
			}
			else if(a+b!=c){
				System.out.println("실패");
				x++;
			}
			
			if(x==5) {
				System.out.println("게임오버");
				break;
			}
			
			
			
		}
		
		
	}

}
