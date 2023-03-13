package java0817;

public class ex08메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sum 메소드를 만들어봅시다.
		System.out.println(add(3,5));
		System.out.println(sub(3,5));
		System.out.println(mul(3,5));
		System.out.println(div(3,5));
		
		
	}
	
	public static int add(int a,int b) {
		int result = a+b;
		return result;
	}
	public static int sub(int a,int b) {
		int result = a-b;
		return result;
	}
	public static int mul(int a,int b) {
		int result = a*b;
		return result;
	}
	public static int div(int a,int b) {
		int result = a/b;
		return result;
	}
}
