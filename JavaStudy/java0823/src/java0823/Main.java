package java0823;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Product p1  = new Product("USB",3000, 5);
		Product p2  = new Product("커피",2000, 15);
		Product p3  = new Product("건전지",1200, 27);
	
		//레퍼런스 변수 3칸생성
		Product[] pList=new Product[3];
		pList[0] =  new Product("USB",3000, 5);
		pList[1] =  new Product("커피",2000, 15);
		pList[2] =  new Product("건전지",1200, 27);
		
		System.out.println(pList[0].getName());
		
		//ArrayList 활용
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product("USB",3000, 5));
		list.add(pList[1]);
		list.add(pList[2]);
		
		System.out.println(list.get(0));
		
		
		
	}

}
