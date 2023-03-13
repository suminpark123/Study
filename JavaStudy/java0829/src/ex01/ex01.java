package ex01;

public class ex01 {
	public static void main(String[] args) {
		
		int num =10;
		int result =getsum(num);
		
		System.out.println(num+"의 약수의합:"+result);
		System.out.print(num+"의 약수 :");
		getDivisor(num);
	}

	
	private static void getDivisor(int num) {
		// TODO Auto-generated method stub
		
//		int[] arr=new int[10];
//		for(int j =0; j<arr.length; j++) {
//			for(int i =1; i<=num; i++ ) {
//				if(num%i==0) {
//					arr[j]=i;
//				}
//			}
//			
//			}
//		for(int j=1; j<=num; j++) {
//			if(num%j ==0) {
//				System.out.print(j+" ");
//			}
//			
//			
//		}
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	private static int getsum(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =1; i<=num; i++) {
			if(num%i==0)
				sum+=i;
		}
		
		return sum;
	}

}
