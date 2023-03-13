package java0810;

import java.util.Scanner;

public class Ex_14배열사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 선언시 데이터 값과 동시에 진행하기
		
//		int[] arr = new int[4];
//		
//		arr[0] = 4;
		
		Scanner sc= new Scanner(System.in);
		int[] arr = {3,2,5,1};
		
		System.out.println("원본:"+arr[0]);
		
		
		arr[0]=10;
		System.out.println("수정후:"+arr[0]);
	}
}
