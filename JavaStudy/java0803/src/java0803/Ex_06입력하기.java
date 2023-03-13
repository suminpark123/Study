package java0803;

import java.util.Scanner;

public class Ex_06입력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력을 위한 도구 : Scanner
		//만들어져 있는 도구를 불러오기 위해서는 import 과정이 필요!
		
		//import 자동완성 : 컨트롤 + 쉬프트 + O
		Scanner sc = new Scanner(System.in);
		
		// println의 ln ->엔터의 의미
		System.out.print("숫자입력 : ");
		
		//불러온 sc 사용하기
		int num = sc.nextInt();
		
		
		
		// 저장된 값 확인하기
		System.out.println(num);
		

	}

}
