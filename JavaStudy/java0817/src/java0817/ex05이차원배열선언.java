package java0817;

import java.util.Arrays;

public class ex05이차원배열선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//이차원 배여ㅕㄹ : 1ㅇ차원 배열안에 또다른 1차원 배열이 저장되어 있는 형태

		//1.선언

		int[][] arr = new int[2][3]; // [층,행][호,열]
		
		//2. 데이터 저장하기
		//2x3 = 6개
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
//		arr[1][0]=4;
//		arr[1][1]=5;
//		arr[1][2]=6;
		int x=1;
		for(int i=0 ; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=x++;
				
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
		//2차원 배열의 6개 방에 슌차적으로 1~6 숫자 저장하기
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[0][0]);
	}
	

}
