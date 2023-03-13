package java0816알고리즘;

public class ex16_n승 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 : "+ result);
		
		
	}
	private static int powerN(int base, int n) {
		// TODO Auto-generated method stub
		
		
		int result = 1;
		
		for(int i = 1; i<=n; i++) {
			
			result *=base;
			
			
		}
		
		return result;
	}
	
	
}


