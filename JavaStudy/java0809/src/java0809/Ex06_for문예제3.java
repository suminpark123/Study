package java0809;

public class Ex06_for문예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i= 21; i<=57; i++  ) {//i++ 1씩증가 ,i+=2 2씩증가
			if(i%2==1) {
			System.out.println(i);
			}
		}
		
		int sum = 0;
		for(int i=0; i<101; i+=3) {
			
		 	
		  
		
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
