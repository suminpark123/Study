package java0817;

public class ex09메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 =50;
		int num2 =15;
		String op = "*";
		
		
		System.out.println(cal(num1,num2,op));
		
	}

	public static int cal(int num1,int num2,String op) {
		
//		int result=0;
//		
//		switch (op) {
//		case "-":
//			result=num1-num2;
//			break;
//		case "*":
//			result=num1*num2;
//			break;
//		
//		}return result;
//		
	int result1 = 0;
	
	if("-".equals(op)) {
		result1= num1-num2;
	}
	else if("*".equals(op)) {
		result1=num1*num2;
	}return result1;
		
	
}

}
