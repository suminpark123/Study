package java0817;

public class ex11메소드10에가까운수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 6;
		int num2 = 5;
		int result = close(num1,num2);
		System.out.println("10에 가까운수 : "+result);

	}

	
	public static int close(int a,int b) {
		int c= 10;
		int result=0;
		
		int a_r =Math.abs(c-a);
		int b_r =Math.abs(c-b);
		if(a_r==b_r) {
			result=0; //return 0;
		}
		else if(a_r<b_r) {
			result=a;
		}
		else {
			result= b;
		}
		return result;
		
	}
}
