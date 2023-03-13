package java0817;

import java.util.Arrays;

public class ex02선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//내림차순
		//여러개의 방 위치에서 가장 큰값을 찾아 0번째 부터 순서대로 정렬

		int[] arr= {98,7,70,13,24};
		System.out.println("원본 :"+Arrays.toString(arr));
		
		for(int i =0; i<arr.length; i++) {//비교 기준을 잡기위한 반복
			for(int j =i+1; j<arr.length; j++) {//기존과 대조해서 비교할 대상반복
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
							
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
