package ex06;

public class Warrior implements Skill, Skin {

	@Override
	public void skin() {
		// TODO Auto-generated method stub
		System.out.println("하얀피부");
	}

	@Override
	public void attack() {
		System.out.println("검 휘두르기");
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("도망쳐");
		// TODO Auto-generated method stub

	}

}
