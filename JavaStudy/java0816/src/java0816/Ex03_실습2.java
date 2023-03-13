package java0816;

import java.util.Random;

public class Ex03_실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd=new Random();
		
		int[] array = new int[5];
		int x=0;
		
		System.out.print("array에 들어있는 홀수는");
		for(int i=0; i<array.length; i++) {
			array[i]=rd.nextInt(99);
			//System.out.print(array[i]+" ");
			
		}
		for(int i=0; i<array.length; i++) {
			array[i]=rd.nextInt(99);
			
			if(array[i]%2==1) {
				System.out.print(array[i]+" ");
				x++;
			}
			
			
			
		}
		System.out.print("이며,");
		System.out.print("\n총"+x+"개 입니다.");
				

	}

}
