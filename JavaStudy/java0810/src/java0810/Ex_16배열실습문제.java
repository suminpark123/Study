package java0810;

import java.util.Random;

public class Ex_16배열실습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//Random rd = new Random();
		
		int x = 0;
		int[] array = {4,13,8,10,1,3,22,53,66,73,28};
				System.out.print("array의 홀수는 ");
			for(int i =0; i<array.length; i++) {
				if(array[i]%2==1) {
				System.out.print(array[i]+" ");
				x++;
				}
				
					
					
				
				
			}System.out.println("이며,");
			
			System.out.println("총"+x+"개 입니다.");
		
				
		
	}

}
