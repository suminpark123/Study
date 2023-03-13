package java0804;

public class Ex_04논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리연산자 : NOT, AND, OR
		//!,&&,||
		// 논리연산을 할땐 피연산자가 반드시 boolean타입
		//boolean (참거짓형태)
		
		
		//&&연산은 논리곱 AND
		// 1*1 = 1
		// 1*0 = 0
		// 0*1 = 0
		// 0*0 = 0
		
	//true = 1 false = 0 ! -> not
		
		//||연산은 논리합 OR
		// 1+1 = 1
		// 1+0 = 1
		// 0+1 = 1
		// 0+0 = 0
		
		
		System.out.println((1<3)&&(4<5)); // t&&t
		System.out.println((2<1)&&(4<5));//f&&t
		System.out.println((1<3)||(4<2)); //t||f
		System.out.println((2<1)||(4<2)); //f||f
		
		System.out.println(!((2<1)||(4<2))); // !(f||f)
		
		
	}

}
