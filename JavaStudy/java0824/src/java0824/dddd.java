package java0824;

import java.util.Arrays;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {98,7,70,13,24};
		//System.out.println("원본 :"+Arrays.toString(arr));
		
		for(int i =0; i<arr.length; i++) {//비교 기준을 잡기위한 반복
			for(int j =i+1; j<arr.length; j++) {//기존과 대조해서 비교할 대상반복
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
							
					
				}
			}
		}
		System.out.println();
		
	}

}
