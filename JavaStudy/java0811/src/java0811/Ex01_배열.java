package java0811;

public class Ex01_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열에 대한 래퍼런스 변수 intArray선언
		int []intArray;
		
		
	System.out.println();
		
		//배열 생성
		intArray =new int[4];
		System.out.println(intArray);
		System.out.println(intArray[0]);
		
		int[] arr=intArray;
		
		intArray[1]=15;
		System.out.println(intArray);
		System.out.println(arr);
		
		int num = 10;
		int temp = num;
		temp = 17;
		
		System.out.println(temp);
		System.out.println(num);
	}

}
