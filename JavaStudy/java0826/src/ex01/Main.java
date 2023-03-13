package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parents p1 = new Parents();
		
		p1.jja();
		p1.jjam();
		
		//상속받아 같은짜장을 불러왔지만 서로다름(오버라이딩)
		Child c =new Child();
		c.jja();
		c.bok();
	
	}

}
