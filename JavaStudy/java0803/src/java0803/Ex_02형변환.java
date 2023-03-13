package java0803;

public class Ex_02형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동(묵시적)형 변환
		// 작은 -> 큰 형태로 변환
		int num1 = 2;
		double num2 = 2.3;
		
		//한줄 빠르게 복사하기 : 컨트롤+ 알트 +아래키
		//한줄 빠르게 삭제하기 : 컨트롤+ D
		System.out.println(num1);
		System.out.println(num2);
		
		//num2 = num1;
		
		//2. 명시적 형변환 (=강제 형변환)
		num1 = (int)num2;
		System.out.println(num1);
		
		
		
	}

}
