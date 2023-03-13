package java0817;


public class ex10메소드큰수비교 {
public static int largerNumbers(int num1,int num2) {
	
	int result=0;
	
	if(num1==num2) {
		result=0;
	
}else if(num1>num2) {
	result=num1;
	
}else if(num2>num1) {
	result=num2;
}
	
	return result;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 =14;
		int num2 =15;
		int result = largerNumbers(num1,num2);
		System.out.println("큰 수 확인 : "+result);	
	}

}