package java0816알고리즘;

import java.util.Random;

public class ex04_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] n = new int[6];
		for (int i = 0; i < n.length; i++) {
			n[i]= rd.nextInt(6)+1;
			for (int j = 0; j < i; j++) {
				if(n[i]==n[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println("행운의 숫자 : " + n[i]);
			
		}
	}
}

