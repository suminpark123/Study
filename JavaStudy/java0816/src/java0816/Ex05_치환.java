package java0816;

public class Ex05_치환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1= 5;
	int num2 =10;
	int temp =0;
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		 temp = num1;//넘1값 템프에 대입
		 num1 = num2;//넘2값 넘1에 대입
		 num2 = temp;//템프값 넘2에 대입
		 System.out.println("num1 ="+num1);
		 System.out.println("num2 ="+num2);
  
	}

}
