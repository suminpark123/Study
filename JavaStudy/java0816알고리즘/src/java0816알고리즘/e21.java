package java0816알고리즘;

import java.util.Random;

public class e21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd= new Random();
		
		int []arr= new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=rd.nextInt(45)+1;
			for(int j =0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}for(int i = 0; i<arr.length; i++) {
			System.out.println("행운의 숫자 : "+arr[i]);
		}
	
		
		
	}

}
