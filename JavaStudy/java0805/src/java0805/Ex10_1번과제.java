package java0805;

import java.util.Scanner;

public class Ex10_1번과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
		
		int a = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원), 2.생수(500원), 3.비타민워터(1500)>>");
		
		int b = sc.nextInt();
		
		int c = a-800;
		
		int d = a-500;
		
		int e = a-1500;
				
		
		
		
		
		if (a>800 && b==1) {
			System.out.println("잔돈 : "+ c +"원");
			
		}else if(a>500 && b==2){
			
			System.out.println("잔돈 : "+ d +"원");
		}else if(a>1500 && b==3){
			
			System.out.println("잔돈 : "+ e +"원");
		}
		

	}

}
