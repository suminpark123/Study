package java0810;

import java.util.Scanner;

public class Ex_15배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형의 배열 'arr' 생성(크기 : 4)
		//각각의 방의 사용자가 입력한  데이터값 저장하기
		
		//ex)정수입력:4
		//ex)정수입력:2
		//ex)정수입력:1
		//ex)정수입력:3
		

		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[4];
		
		
		for(int i = 0; i<=3; i++) {
			
		System.out.print("정수입력 :");
		arr[i]=sc.nextInt();
		
		
		}
		for(int i =0; i<=3; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
