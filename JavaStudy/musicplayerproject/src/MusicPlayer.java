

import java.util.ArrayList;//컨트롤러 클래스

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	ArrayList<Music> musicList =new ArrayList<Music>(); 
	int currentIndex = 0;
	MP3Player mp3 = new MP3Player();
	
	
	public MusicPlayer() {
		musicList.add(new Music("DallaDalla", "Itzy", 100,"C://Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("깡", "Rain", 120,"C://Rain - 깡.mp3"));
		musicList.add(new Music("SOLO", "JENNIE", 200,"C://JENNIE - SOLO.mp3"));
	}
	
	public Music play() {
		
		Music m = musicList.get(currentIndex);// 뮤직리스트의 0번째 호출/0번째 주소값 m에 저장
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(m.getMusicPath());
		
		return m;  //m을 리턴
	}
	
	public Music nextplay() {
		currentIndex++ ;
		
		if(currentIndex ==musicList.size()) {
			currentIndex=0;
		}
		Music m = musicList.get(currentIndex);
		
		return m;
	}
	public Music preplay() {
		currentIndex --;
		if(currentIndex < 0) {
			currentIndex=musicList.size()-1;
		}
		Music m = musicList.get(currentIndex);
		return m;
		
	}
	public String stop() {
		
		String a = "노래가 정지되었습니다.";
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		return a;
	}
}
