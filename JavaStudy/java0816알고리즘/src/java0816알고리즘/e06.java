package java0816알고리즘;

public class e06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=1; i<101; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			else{
				System.out.print("-"+i+" ");
			}
		}
		int sum = 0;
		int sum2 =0;
		for(int i=1; i<100; i+=2) {
			sum+=i;
		}
		for(int j=-2; j>=-100; j-=2) {
			sum2+=j;
		}
		
		
		System.out.print("\n결과 : "+(sum+sum2));
		
	}

}
