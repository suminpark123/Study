package java0816알고리즘;

public class ex17_true {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 : "+ result);	
	}

	private static boolean isDivide(int num1, int num2) {
		// TODO Auto-generated method stub
		
		boolean a = true;
		
		if(num1%num2==0) {
			a = true;
		}
		else {
			a = false;
		}		
		return a;
	}

}
