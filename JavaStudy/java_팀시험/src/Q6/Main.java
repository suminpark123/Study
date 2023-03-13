package Q6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		StoreController store =new StoreController();
		store.addList();
		
		
		while(true) {
			System.out.println("메뉴선택");
			System.out.println("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료>>");
			int choice =sc.nextInt();
			
			if(choice==1) {
				System.out.println("음식점보기");
				store.findRestaurant();
				
			}
			
			else if(choice==2) {
				System.out.println("미용실보기");
				store.findSalon();
			}
			else if(choice==3) {
				System.out.println("상세보기");
				System.out.println("가게명 입력:");
				String storename =sc.next();
				store.storePoint(storename);
			}
			else if(choice==4) {
				System.out.println("평점보기");
				store.totalView();
			}
			else if(choice==5) {
				System.out.println("프로그램종료");
				break;
			}
			else {
				System.out.println("숫자를 다시입력햊쉐요");
			}
		}
		
		
		
		
	}

}
