package java시험;

import java.util.Scanner;

public class java시험1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자입력>>");
		int a=sc.nextInt();
		
		System.out.print("10으로 나눈 몫 : " +a/10+"\n");
		
		System.out.print("10으로 나눈 나머지 :"+a%10);
		

}
}