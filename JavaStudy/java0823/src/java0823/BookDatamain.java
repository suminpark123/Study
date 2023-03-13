package java0823;

import java.util.Scanner;

public class BookDatamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BookData[] arr= new BookData[5];
		
		arr[0]= new BookData("java",21000,"홍길동");
		arr[1]= new BookData("C++",29000,"박문수");
		arr[2]= new BookData("Database",31000,"김장독");
		arr[3]= new BookData("Android",18000,"이순신");
		arr[4]= new BookData("Web",26000,"김철수");
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int m = sc.nextInt();
		
		System.out.print("구매 가능한 책 목록 \n");
		for(int i =0; i<arr.length; i++) {
			if(m>=arr[i].getPrice()) {
				String title =arr[i].getTitle();
				int price = arr[i].getPrice();
				String writer = arr[i].getWriter();
				System.out.println("["+title+","+writer+","+price+"]");
				System.out.println(arr[i].toString());
			}
			
			
		
		
	}

	}
}
