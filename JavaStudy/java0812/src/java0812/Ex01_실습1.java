package java0812;

import java.util.Scanner;

public class Ex01_실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] name = {"김미희","정세연","김동원","김용현"};
		Scanner sc=new Scanner(System.in);
		System.out.print("검색 할 이름을 입력하세요.>>");
		String inputName=sc.next();
		
		
		for(int i =0; i<name.length; i++) {
			if(inputName.equals(name[i])) {
				System.out.print(inputName+"님은 "+i+"번째 인덱스에 저장되어 있습니다.");
				
			}else {
				System.out.print("배열에 데이터가 없습니다.");
				break;
			}
			
		}
		
			
		
		
	}

}
