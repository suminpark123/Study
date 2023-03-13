package java0823;

import java.util.Scanner;

public class StudentScoremain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentScore[] arr = new StudentScore[3];
		
		Scanner sc=new Scanner(System.in);
		String a =" ";
		int b=0;
		int c=0;
		int d=0;
		for(int i =0; i<arr.length; i++) {
			System.out.print(i+1+"번째 학생의 이름을 입력하세요>>");
			 a =sc.next();
			System.out.print(i+1+"번째 학생의 java점수를 입력하세요>>");
			 b = sc.nextInt();
			System.out.print(i+1+"번째 학생의 web점수를 입력하세요>>");
			 c = sc.nextInt();
			System.out.print(i+1+"번째 학생의 android점수를 입력하세요>>");
			 d = sc.nextInt();
			 
			 arr[i]=new StudentScore(a,b,c,d,b+c+d);
			 
			 
					
		}		
		

//		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName()+"님의 총점은"+arr[i].getsum()+"점,"+"평균은"+arr[i].getsum()/arr.length+"점 입니다.");
		}
		
	}
}



