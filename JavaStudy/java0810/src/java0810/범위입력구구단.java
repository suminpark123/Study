package java0810;

import java.util.Scanner;

public class 범위입력구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 :");
		int x= sc.nextInt();
		System.out.println("어느수 까지 출력 :");
		int y = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(x+"*"+i+"="+x*i);
			if(y==i) {
				break;
			}
		}
	}

}

