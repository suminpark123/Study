package java0818;

import java.util.Scanner;

public class ex08_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		String data = "여러분 잘 쉬셨나요?";
//		
//		
//		
//		System.out.println(data.charAt());//substring
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제시어>>");
		
		String a = sc.next();
		
		
		
		
		
		
		
		
		
		while(true) {
			System.out.print("단어를 입력해 주세요>>");	
			String b = sc.next();
			if(a.charAt(a.length()-1)==b.charAt(0)) {
				
				a=b;
			}
			  
			
			
			else {
				System.out.println("틀렸습니다.");
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
