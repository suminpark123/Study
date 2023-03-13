package java0818;

import java.util.Scanner;

public class ex07_indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "010-2407-1065";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 문자 입력 : ");
		String n=sc.next();
		
		
		if(data.contains(n)) {//contains 문자열전체
			System.out.println(n+"은 포함되어 있습니다."
					+ "");
			
	//		sc.nextline 공백 전체 읽기
	//      sc.next 공백까지만
		}
		else {
			System.out.println(n+"은 문자열에 포함되어 있지 않습니다.");
		}
	}

}
