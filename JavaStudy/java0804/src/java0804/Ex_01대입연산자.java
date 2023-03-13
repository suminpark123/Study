package java0804;

public class Ex_01대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		num+=3; // num = num+3;
		
		System.out.println(num);
		
		//치환
		int a = 13;
		int b = 20;
		
		System.out.println(a+","+b);
		
		//치환하는 코딩
		int temp = a;
		 a = b;
		 b = temp;
		 
		 //
		
		
		
		
		System.out.println(a+","+b);
	}

}
