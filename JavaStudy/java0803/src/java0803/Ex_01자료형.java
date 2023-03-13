package java0803;

public class Ex_01자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형(=데이터 타입)이란 무엇일까?
		// 1. 논리형(boolean) 선언하기
		// 선언의 방법: 자료형 변수이름 = 데이터 ;
		boolean a = true;
		boolean b = false;
		
		//2. 문자형(char) 선언하기->작은 따옴표 사용
		char c = 'a';
		//char d = "e"; // " "-> 문자열
		
		//여러개의 문자를 담기위한 자료형
		//String -> 레퍼런스형 자료형 (=참조형)
		String word = "안녕하세요~";
		
		//3. 정수형(int) 선언하기
		//byte,short,long
		
		byte e = 1;
		short f = 2;
		long g = 3;
		
		//4. 실수형(double) 선언하기
		//float
		double h = 3.14;
		float h2 = 3.14f;
		
		double num1 = 10.0;
		double num2 = 7.0;
		
		float num3 = 10.0f;
		float num4 = 7.0f;
				
				
				System.out.println(num1 / num2);
				System.out.println(num3 / num4);
				
				
		
	}

}
