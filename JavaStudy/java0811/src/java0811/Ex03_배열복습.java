package java0811;

public class Ex03_배열복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수형 데이터 5개를 담을 수 있는 intArray 래퍼런스 변수 선언
		int[] intArray =new int[5];
		
		intArray[0]=6;
		
		for(int i =0; i<intArray.length; i++) {
			intArray[i]=i+6;
			System.out.println(intArray[i]);
		}
		for(int i =0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		 
	}

}
