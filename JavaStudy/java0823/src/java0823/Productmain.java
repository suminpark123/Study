package java0823;

import java.util.ArrayList;
import java.util.Scanner;

public class Productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		ArrayList<Product> alist= new ArrayList<Product>();
		
//		Product p1 = new Product("USB",22000, 4);
//		Product p2 = new Product("커피",3100, 7);
//		alist.add(p1);
//		alist.add(p2);
		int t =0;
		
		while(true) {		
			System.out.print("[1]물건 추가"+"[2]예상 판매량 조회"+"[3]종료>>");
			int x= sc.nextInt();
			if(x==3) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(x==1) {
				System.out.print("물건 이름 :");
				String a=sc.next();
				System.out.print("단가 : ");
				int b= sc.nextInt();
				System.out.print("수량 : ");
				int c= sc.nextInt();
				Product p =new Product(a,b,c);
				alist.add(p);
				
			
			}
			else if(x==2) {
				System.out.print("제품명"+"\t"+"단가"+"\t"+"수량\n");
				for(int i=0; i<alist.size(); i++) {
					System.out.println(alist.get(i).getName()+"\t"+alist.get(i).getUnitPrice()+"\t"+alist.get(i).getAmount());
					t +=alist.get(i).getUnitPrice()*alist.get(i).getAmount();
				}
				

				System.out.println(t+"원");
				
				
				
			}
			
		}
		
		
	
		
		
		
		
	}

}
