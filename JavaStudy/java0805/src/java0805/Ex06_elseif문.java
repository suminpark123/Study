package java0805;

import java.util.Scanner;

public class Ex06_elseif문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if (조건식){
		// 실행문
		//}else if(조건식){
		//실행문
		//}else{
		//실행문
		//}
		
		// 학점계산
//		90점이상 : A
//		80점이상 : B
//		70점이상 : C
//		60점이상 : D
//		60점미만 : F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 :");
		
		int a = sc.nextInt();
		
		if (a>=90) {
			System.out.println("A");
			
		}else if (a>=80) {
			System.out.println("B");
			
			
		}else if (a>=70 ) {
			System.out.println("C");
			
		}else if (a>=60) {
			System.out.println("D");
			
		}else if (a<60)
			System.out.println("F");
		}
	

}
