

import java.util.Scanner; //뷰클래스

public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();// 이게 있어야 뮤직플레이어클래스 호환가능

		while (true) {
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료>>");
			int menu = sc.nextInt();
			if (menu == 5) {
				System.out.print("프로그램 종료");
				break;
			} else if (menu == 1) {
				// 객체생성을해야 호출사용가능
				Music m = player.play();
				System.out.println(musicInfo(m));
				

			} else if (menu == 3) {
				Music m = player.nextplay();
				System.out.println(musicInfo(m));
			} else if (menu == 4) {
				Music m = player.preplay();
				System.out.println(musicInfo(m));
			} else if (menu == 2) {
				String msg =player.stop();
				System.out.println(msg + "\n");
			}
		}

	}

	private static String musicInfo(Music m) {
		return m.getSinger() + ","+m.getMusicName() + "," + changeTime(m)+"\n";
	}
	private static String changeTime(Music m) {
		return m.getPlayTime() / 60 + "분"
				+ m.getPlayTime() % 60 + "초";
	}
}