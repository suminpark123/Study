package ex03;

import java.util.Scanner;

public class Main { //뷰

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		System.out.println("사냥 방법 알아보기!");
		System.out.print("[1]독수리 [2]사자 [3]늑대>>");
		int c =sc.nextInt();
		
		WildAni[] aniArray = new WildAni[3];
		aniArray[0] = new Eagle();
		aniArray[1] = new Lion();
		aniArray[2] = new Wolf();
		
		aniArray[c-1].hunt();
		
//		WildAni ani = null;
//		if(c==1) {
//			ani = new Eagle();
//			
//		}
//		else if(c==2) {
//			ani =new Lion();
//			
//		}
//		else if(c==3) {
//			ani = new Wolf();
//			
//		}
//		ani.hunt();
	}

}
