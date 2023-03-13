
public class Ex01_변수 {
	public static void main(String[] args) {
		System.out.println("hello world");
	
		int num; //변수 선언
		num = 10; // 초기화
		//변수명 절대 중복볼가
		int num2 = 15; // 선언과 초기화 동시
		System.out.println(num);
		
		num = 17; // 선언필요x 대입
		System.out.println(num);
		
		
		// 상수 : 한번 초기화를 하면 다시는 변경할 수 없다.
		final int num3 = 20;
		System.out.println(num3);
		
		int n = 1;
		
		
	}
}
