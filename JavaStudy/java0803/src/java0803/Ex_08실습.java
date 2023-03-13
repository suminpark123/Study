package java0803;

import java.util.Scanner;

public class Ex_08실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 :");
		
		int totalSecond = sc.nextInt();
				
		
		int hour = totalSecond/3600; 
		
		int min2 = totalSecond%3600;
		int min3 = min2/60;
		
		//int minute = totalSecond/60-(hour*60);
		//int second = totalSecond%60;
		int sec2 = min2%60;
		
		
		//System.out.println(hour+"시"+minute +"분" + second + "초");
		System.out.println(hour+"시"+min3 +"분" + sec2 + "초");

	}

}
