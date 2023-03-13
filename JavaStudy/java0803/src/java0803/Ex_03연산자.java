package java0803;

public class Ex_03연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.정수형의 변수 num1 선언
		// 데이터 값 ->10
		int num1 = 10;
		
		//2.정수형의 변수 num2 선언
		// 데이터 값 -> 2
		int num2 = 2;
		
		//3. num1에서 num2를 나눈 몫의 값을
		// 정수형의 변수 result1에 저장
		int result1 = num1/num2;
		
		
		//4. num1에서 num2를 나눈 나머지의 값을
		//정수형의 변수 result2에 저장
		int result2 = num1%num2;
		
		//5. 두 결과 값 출력하기!
		//+ -> 항들과 함께 쓰이면 실제 연산!
		//  -> 문자나 변수명(데이터 값)과 쓰이면 '연결고리' 의미
		System.out.println("result1의 결과값 : " +result1);
		System.out.println("result2의 결과값 : " +result2);
		
		
		
		int num3 = 5;
		String num4 = "12";
		int num5 = 2;
		System.out.println(num3 + num5 + num4);
		
		//슛자+숫자= 숫자
		//문자+숫자= 문자
		
		//숫자+문자= 문자
		
		int orange = 3729;
		int number = 52;
		
	
		int result = orange/number;
		
		System.out.println("김모씨가 귤 박스를 줄 수 있는 박스의 수는?" +result);
		
		
		
	}

}
