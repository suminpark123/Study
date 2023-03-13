package java0817;

public class ex03순차검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,35,15,11,26,72,78,13,61,90};
		
		int search =78;
		
		for(int i =0; i<arr.length; i++) {
			if(search== arr[i]) {
				System.out.println(i);//찾고자 하는 방의 index출력
			}
		}
	}

}
