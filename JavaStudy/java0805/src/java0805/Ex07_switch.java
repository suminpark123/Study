package java0805;

public class Ex07_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key와 value는 정수,문자,문자열
//switch (key) {
//case value:           ->key==value1
//	실행문;
//	break;
//cas value2:		     ->key==value2
//  실행문;
//  break;		
//default:
//	break;
//}
		int num = 10;
		
		switch (num) {
		case 10:
			System.out.println("10입니다.");
			break;
		case 20:
			System.out.println("20입니다.");
			break;
		case 30:
			System.out.println("30입니다.");
			break;
		default:
			break;
		}
		
		
	}

}
