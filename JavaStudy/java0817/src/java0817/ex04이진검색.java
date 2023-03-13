package java0817;

public class ex04이진검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr={1,7,16,25,30,33,41,66,78,90};
		
		//찾고자 하는 index의 최소 범위와 최대 범위를 기억하기 위한 변수 선언

		int low = 0;
		int height= arr.length-1;
		
		int search = 78;
		//몇번째 시도에 찾고자 하는 값을 찾을 수 있는지 모르므로 while문 사용
		while(true) {
			int middle = (low+height)/2;
			
			if(search==arr[middle]) {
				System.out.println(middle);
				break;
				}else if(search > arr[middle]) {
					//int[] arr ={1,7,16,25,30,33,41,66,78,90};
					low=middle+1;
				}else if(search< arr[middle]) {
					height=middle-1;
				}
			}
	}

}
