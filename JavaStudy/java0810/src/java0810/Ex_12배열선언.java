package java0810;

public class Ex_12배열선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 : 같은 타입의 데이터들을 더 빠르고 효과적으로 관리하기 위하여 사용
		
		//1.배열선언하기
		//정수형의 배열 [] 생성
		int[] num;
		
		//2. 배열 크기지정
		num = new int[3];
		
		System.out.println(num[0]);
		
		//3.배열에 값 저장하기
		num[0] = 1;//num[위치] = 1;
		num[1] = 2;
		num[2] = 3;
		System.out.println("배열의 0번째방 :"+num[0]);
		System.out.println("배열의 주소값 :"+num);
		System.out.println("배결의 길이(크기) :"+num.length);
	}

}
