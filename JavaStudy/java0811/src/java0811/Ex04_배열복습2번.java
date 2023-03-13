package java0811;

import java.util.Random;

public class Ex04_배열복습2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		int[]num= new int[5];
		
		int max = 0;
		
		//System.out.println(num);
		int min = num[0];
		for(int i = 0; i<num.length; i++) {
			//System.out.println(num[i]);
			num[i] = rd.nextInt(10)+1;
			if(max<num[i]) {
				max=num[i];
				
				
			}
			
			else if(min >num[i]) {
				min=num[i];
				
			}
			
		}System.out.print("가장큰값은 ");
		System.out.println(max+"입니다.");
		System.out.println(min);
		
	}

}
