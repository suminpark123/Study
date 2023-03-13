package java0818;

public class ex02_약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =15;
		int result =getSumofDivisors(num);
		
		System.out.println(num+"의 약수의 합 : "+result);
		
		int startValue = 2;
		int endValue =1000;
		getperfectNumber(startValue,endValue);
		
		
	}
	
	public static int getSumofDivisors(int a) {
		int result =0;
		int sum = 0;
		
		
	   for(int i=1; i<=a; i++) {
		   if(a%i==0)
		   sum+=i;
	   }
	   result=sum;
		
		
		return result;
	}
	
	
	public static void getperfectNumber(int start,int end) {
		int result =0;
		
		for(int n = start; n<=end; n++) {			
			
			if((getSumofDivisors(n)-n)==n) {
				System.out.println(n);
				
			}
			  
		   }
		}
		 
			 
			
		 
		
		
	//	return result;
		
	}

