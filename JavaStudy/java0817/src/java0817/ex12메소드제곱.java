package java0817;

public class ex12메소드제곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =2;
		int n =4;
		int result = powerN(base, n);
		System.out.println("결과 확인 : "+result);

	}
	public static int powerN(int base,int n) {
		
		int result =1;
		for(int i=1; i<=n; i++) {
			result *=base;
			
		
		}
		return result;
		
	}
}

