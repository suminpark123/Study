package musicpro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실행되는 공간
		//1.. 설계도면을 가지고 객체를 생성
		// 설계도면의 이름 펄슨
		Person p1 =new Person("박수민",28,"남자",176);
		//펄슨 설계도를 가져와 변수 p1으로 사용.
		
		
//		p1.name = "박수민";
//		p1.age = 28;
//		p1.height = 176;
//		p1.gender ="남자";
		
		System.out.println(p1.name);
		//메소드도 가져올수있다.
		p1.eat();
		p1.feeling();
		p1.sleep();
	
		//설계도 만들어두면 계속사람생성가능
	//	Person p2 =new Person();
//		p2.name = "팍수민";		
//		p2.age = 26;
//		p2.height = 146;
//		p2.gender ="남자";
//		System.out.println(p2.gender);
		
		p1.eat();
		p1.feeling();
		p1.sleep();
		
	}

}
