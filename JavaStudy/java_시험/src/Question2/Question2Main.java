package Question2;

public class Question2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		
		t.channel= 7;
		t.color="red";
		t.print();
		t.channelUp();
		t.channelUp();
		t.print();
		t.color="black";
		t.channelDown();
		t.print();
	}

}
