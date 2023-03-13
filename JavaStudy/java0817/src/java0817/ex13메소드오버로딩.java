package java0817;

public class ex13메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2.5,2.1));
		
		
		
	}
	public static int sum(int a,int b) {
		int result = a+b;
		return result;
	}
	public static double sum(double a,double b) {
		double result = a+b;
		return result; // 강제 형변환 (int)
	}
}

//메소드 오버로딩기법
//메소드의 이름은 동일하되 매개변슈의 갯수,타입을 달리해서 중복정의 하는 기법

//메소드 오버라이딩
//부모클래스로부터 상속받은 메소드를 자식클래스에서 재정의하는 기법
