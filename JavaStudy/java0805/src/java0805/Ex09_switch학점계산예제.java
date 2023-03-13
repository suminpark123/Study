package java0805;

import java.util.Scanner;

public class Ex09_switch학점계산예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.print("점수 입력 :");
	    
		int a = sc.nextInt();
		
		
		
		switch (a/10) {
		case 10:
			System.out.println("A학점입니다.");
			break;
		case 9 :
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");			
			break;
		case 7:
			System.out.println("C학점입니다.");			
			break;
		case 6:
			System.out.println("D학점입니다.");			
			break;
		default:
			System.out.println("F학점입니다.");
			break;
		}

	}

}


