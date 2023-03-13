package java0810;

import java.util.Random;

public class Ex_13배열사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//1.정수형의 배열 'arr' (크기는 5개) 선언
		
		//2.각각의 방에 랜덤수(1~10)를 사용하여 값 저장
		
		//3. 모든 방의 데이터 값 출력하기
		
		
		int [] arr = new int[5];//int arr [] 도 가능
		
		
		
		Random rd = new Random();
		
//		arr [0] =rd.nextInt(10)+1;
//		arr [1] =rd.nextInt(10)+1;
//		arr [2] =rd.nextInt(10)+1;
//		arr [3] =rd.nextInt(10)+1;
//		arr [4] =rd.nextInt(10)+1;
		
		for(int i =0; i<arr.length; i++) {//.length : 방번호까지
			arr[i]=rd.nextInt(10)+1;
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i =0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}

}
