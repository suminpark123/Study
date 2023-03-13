package java0822;

public class addressmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//클래스명 객체이름(변수명) = new 클래스명();
		
		//address클래스로 만들어진 객체의 주소를 담을 수 있도록 레퍼런스 변수선언
		address addr1;
		
		//객체 생성 후 addr1에 주소를 대입
		
		addr1=new address();
		
		System.out.println(addr1);
		
		//생성된 객체의 필드와 메소드를 사용하기 위해서 .을 활용한다.
		addr1.name="김미희";
		addr1.addr="광주광역시 동구";
		addr1.age = 20;
		addr1.phoneNumber="010-2407-1465";
		
		
		addr1.showAddr();
		
		
		System.out.println(addr1. name);
		
		address addr2= new address();
		System.out.println(addr2);
		
		
		addr2.name="노강민";
		addr2.addr="광주광역시 북구";
		addr2.age = 22;
		addr2.phoneNumber = "010-0000-0000";
		
		addr2.showAddr();
	}

}
