package ex06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Archor a =new Archor();
		a.attack();
		a.run();
		System.out.println();
		Warrior w =new Warrior();
		System.out.println("전사 캐릭터 서버 :"+w.server);
		w.attack();
		w.run();
		w.skin();
		
		
		
	}

}
