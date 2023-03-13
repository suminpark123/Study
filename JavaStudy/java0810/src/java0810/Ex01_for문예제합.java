package java0810;

public class Ex01_for문예제합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int sum2 = 0;
		
		
		for (int i = 1; i<101; i++) {
			
			if(i%2==0) {
				System.out.print("-"+i+" ");
				
				
				
			}else {
				System.out.print(i+" ");
				
			}
			
		}
		for(int j = 1; j<100; j+=2) {
			sum = sum+j;
			
		}
		for(int k = -2; k>=-100; k-=2) {
			sum2 = sum2+k;
		}
		System.out.println("");
		System.out.println("결과 :"+(sum+sum2));
	}

}
