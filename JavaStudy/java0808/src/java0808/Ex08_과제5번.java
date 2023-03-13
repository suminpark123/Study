package java0808;

import java.util.Random;
import java.util.Scanner;

public class Ex08_과제5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd =new Random();
		Scanner sc = new Scanner(System.in);
		
		int fail = 0;
		
		for(int i =0; i<1000000; i++) {
		
		int a = rd.nextInt(10);	
		int b = rd.nextInt(10);
		
		System.out.print(a +"+"+ b+ "=");
		int result =sc.nextInt();
		
		if(result==a+b) {
			System.out.println("Success");
			
		}else {
			System.out.println("Fail");
			fail++;
			
		}if(fail==5)break;
		
		}System.out.println("GAME OVER");
	}

}