package Question2;

public class Tv {

	

	int channel;
	String color;
		
	public int channel(int channel) {
		return channel;
	}	
	public String color (String color) {
		return color;
	}
	
	public void print() {
		System.out.println("Tv의 현재 채널은 :"+channel+"이고, Tv의 색깔은 "+color +"입니다.");
	}
		
	public int channelUp() {
		return channel++;
	}
	public int channelDown() {
		return channel--;
	}

}
