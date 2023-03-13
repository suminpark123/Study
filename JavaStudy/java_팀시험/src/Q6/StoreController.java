package Q6;

import java.util.ArrayList;

public class StoreController {

	ArrayList<Store> list = new ArrayList<>();

	public void addList() {
		list.add(new Restaurant("해성식당", "음식정", 80, 90, 84.2, 70.213));
		list.add(new Restaurant("신전떡볶이", "음식점", 98, 95.45, 90.54, 100));
		list.add(new Restaurant("왕뼈사랑", "음식점", 70, 76, 80.54, 85));
		list.add(new Salon("박승철", "미용실", 80, 70, 90.44));
		list.add(new Salon("리안", "미용실", 70, 87, 78.45));
		list.add(new Salon("이가자", "미용실", 78, 89, 86.98));

	}

	public void storePoint(String storename) {
		System.out.println("가게명 :" + storename);
		for (int i = 10; i < 101; i += 10) {
			System.out.print(i + "\t");
		}
		for (int j = 0; j < list.size(); j++) {
			if (storename.equals(list.get(j).getName())) {
				System.out.println();
				for (int i = 1; i < list.get(j).grade() / 10; i++) {
					System.out.print("*" + "\t");
				}
				System.out.println();
				System.out.printf("펑점 : "+"%.2f", list.get(j).grade());
				System.out.println();
			}
		}
	}

	public void totalView() {
		String[][] score = new String[7][11];
		score[0][1] = "10";
		score[0][2] = "20";
		score[0][3] = "30";
		score[0][4] = "40";
		score[0][5] = "50";
		score[0][6] = "60";
		score[0][7] = "70";
		score[0][8] = "80";
		score[0][9] = "90";
		score[0][10] = "100";
		score[0][0] = " ";
		for (int i = 1; i < score.length; i++) {
			score[i][0] = list.get(i - 1).name;
		}
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 1; j <= 10; j++) {
				if (list.get(i).grade() > j * 10) {
					score[i + 1][j] = "*";
				} else {
					score[i + 1][j] = " ";
				}
			}
		}
		for (int i = 10; i >= 0; i--) {
			for (int j = 0; j < score.length; j++) {
				System.out.print(score[j][i] + "\t");
			}
			System.out.println();
		}
	}

	public void findRestaurant() {
		System.out.println("====음식점보기====");
		System.out.println("1.해성식당\t평점 : " + list.get(0).grade());
		System.out.println("2.정림이네\t평점 : " + list.get(1).grade());
		System.out.println("3.왕뼈사랑\t평점 : " + list.get(2).grade());
	}

	public void findSalon() {
		System.out.println("박승철 평점 : " + list.get(3).grade());
		System.out.println("이가자 평점 : " + list.get(4).grade());
		System.out.println("리안 평점 : " + list.get(5).grade());
	}
}
