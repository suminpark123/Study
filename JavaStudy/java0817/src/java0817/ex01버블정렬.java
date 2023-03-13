package java0817;

import java.util.Arrays;

public class ex01버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 버블 정렬 : 인접한 2개의 데이터를 비교하여 정렬하는 알고리즘
		// 속도는 느리지만 (여러번의 step이 존재하므로) 코드는 단순하다
		
		int[] arr= {45,7,12,82,25};
		int tmp=0;
		//step : 반복적으로 원소들을 비교해야 하는 단계 -> 배월의 길이 -1의 횟수만큼 진행
		
		
		for(int s = 0; s<arr.length-1; s++) {
		System.out.println((s+1)+"step:");
		// 두개의 인자를 비교 할 수 있는 반복문 생성
		// [0]<->[1] / [1]<->[2]/ [2]<->[3]/ [3]<->[4] 1step
		
		for(int i=0; i <arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				tmp= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tmp;
			}
		}
		System.out.println(Arrays.toString(arr));
		}
		
	}

}
