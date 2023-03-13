package java0805;
//
import java.util.Scanner;
//
public class Ex12_3번과제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("금액을 입력하세요.");
//		
//		int a = sc.nextInt();
//		
//		System.out.println("메뉴를 고르세요");
//		System.out.print("1.콜라(800원), 2.생수(500원), 3.비타민워터(1500)>>");
//		
//		int b = sc.nextInt();
//		
//		int c = a-800;
//		
//		int d = a-500;
//		
//		int e = a-1500;
//		
//		
//		
//		
//		int f = c/1000; //천을 나눈몫
//		
//		int cc = c%1000;//천의 나머지
//		
//		int g = cc/500; //나머지로 500을 나누고
//		
//		int ww = c%500; //500의 나머지
//		
//		int i = ww/100; //100의 나머지
//		
//		
//		
//        int f1 = d/1000; //천을 나눈몫
//		
//		int cc1 = d%1000;//천의 나머지
//		
//		int g1 = cc1/500; //나머지로 500을 나누고
//		
//		int ww1 = d%500; //500의 나머지
//		
//		int i1= ww1/100; //100의 나머지
//		
//		
//		
//        int f2 = e/1000; //천을 나눈몫
//		
//		int cc2 = e%1000;//천의 나머지
//		
//		int g2 = cc2/500; //나머지로 500을 나누고
//		
//		int ww2 = e%500; //500의 나머지
//		
//		int i2= ww2/100; //100의 나머지
//		
//		
//		
//		
//			
//				
//		
//		
//				
//		
//		
//		
//		
//		if (a>800 && b==1) {
//			System.out.println("잔돈 : "+ c +"원");
//			System.out.println("천원 :"+ f +"개,"+"오백원 :"+ g +"개,"+"백원 :"+ i +"개");
//		}else if(a>500 && b==2){
//			
//			System.out.println("잔돈 : "+ d +"원");
//			System.out.println("천원 :"+ f1+"개,"+"오백원 :"+g1 +"개,"+"백원 :"+i1 +"개");
//		}else if(a>1500 && b==3 ){
//			
//			System.out.println("잔돈 : "+ e +"원");
//			System.out.println("천원 :"+ f2+"개,"+"오백원 :"+ g2+"개,"+"백원 :"+i2+"개");
//		
//		}else if (b==1 && a<800) {
//			System.out.println("돈이 부족해요ㅠ");
//			System.out.println("잔돈 : "+ a +"원");
//			
//		}else if (b==2 && b<500) {
//			System.out.println("돈이 부족해요ㅠ");
//			System.out.println("잔돈 : "+ a +"원");
//			
//			
//		}else if (b==3 && b<1500) {
//			System.out.println("돈이 부족해요ㅠ");
//			System.out.println("잔돈 : "+ a +"원");
//			
//		}
//		
//
//	}

//}



 
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int money, choice, change = 0; // 넣은 금액, 메뉴 선택, 잔돈
        int cola = 800; // 콜라
        int water = 500; // 생수
        int vitaminWater = 1500; // 비타민워터
        int oneThousandWon, fiveHundredWon, oneHundredWon = 0; // 천원, 오백원, 백원
        
        // 금액 입력
        System.out.println("금액을 입력하세요.");
        money = sc.nextInt();
        
        // 메뉴 입력
        System.out.println("메뉴를 고르세요");
        System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
        choice = sc.nextInt();
 
        // 메뉴 선택 후 잔돈 구하기, 돈이 부족한지 확인
        if (choice==1 && money>=cola) {
            change = money - cola;
        } else if (choice==2 && money>=water) {
            change = money - water;
        } else if (choice==3 && money>=vitaminWater) {
            change = money - vitaminWater;
        } else {
            change = money;
            System.out.println("돈이 부족해요 ㅠㅠ");
        }
        
        System.out.println("잔돈 : " + change + "원");
        
        oneThousandWon = change/1000;
        fiveHundredWon = change%1000/500;
        oneHundredWon = change%1000%500/100;
        System.out.print("천원 : " + oneThousandWon + "개, " );
        System.out.print("오백원 : " + fiveHundredWon + "개, ");
        System.out.println("백원 : " + oneHundredWon + "개");
        
    }
 
}


