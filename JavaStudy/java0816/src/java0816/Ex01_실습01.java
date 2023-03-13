package java0816;

public class Ex01_실습01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형 데이터를 담을수 있는 배열 array
		//정수형 데이터1~10 담을수있도록 배열을 생성
		//각각의 인덱스에 1부터10까지 초기화
		//인덱스에 있는 데이터를 출력
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
