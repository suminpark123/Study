package java0824;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> slist = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);
		System.out.print("====학점관리 프로그램====\n");

		while (true) {
			String a = "";
			String b = "";
			int c = 0;
			int d = 0;
			int e = 0;
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]정보삭제 [5]프로그램종료>> ");
			int x = sc.nextInt();
			if (x == 5) {
				System.out.print("학점 관리 프로그램을 종료합니다.");
				break;
			} else if (x == 1) {
				System.out.print("이름 : ");
				a = sc.next();
				System.out.print("학번 : ");
				b = sc.next();
				System.out.print("java점수 : ");
				c = sc.nextInt();
				System.out.print("web점수 : ");
				d = sc.nextInt();
				System.out.print("android점수 : ");
				e = sc.nextInt();

				Student s = new Student(a, b, c, d, e);
				slist.add(s);
			} else if (x == 2) {

				System.out.print("====전체조회====\n");
				System.out.println("이름\t학번\tJava\tAndroid\tWeb");
				for (int i = 0; i < slist.size(); i++) {
					System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
							+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
							+ slist.get(i).getScoreAndroid() + "\n");
				}
				if (slist.size() == 0) {
					System.out.print("조회할 데이터가 없습니다.\n");
				}

				System.out.print("=============\n");
			}

			else if (x == 3) {
				System.out.print("검색할 이름 입력: ");
				String name = sc.next();
				System.out.print("====학생검색====\n");
				System.out.println("이름\t학번\tJava\tWeb\tAndroid\t평균\t학점");
				int avg = 0;
				int p = 0;
				boolean ck = true;
				for (int i = 0; i < slist.size(); i++) {
					if (slist.get(i).getName().equals(name)) {
						avg = (slist.get(i).getScoreAndroid() + slist.get(i).getScoreJava()
								+ slist.get(i).getScoreWeb()) / 3;
						if (avg >= 95) {
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "A+" + "\n");
						} else if (avg >= 90 && avg < 95) {
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "A" + "\n");
						} else if (avg >= 85 && avg < 90) {// A
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "B+" + "\n");
						} else if (avg >= 80 && avg < 85) {// B
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "B" + "\n");
						} else if (avg >= 75 && avg < 80) {
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "C+" + "\n");
						} else if (avg >= 70 && avg < 75) {
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "C" + "\n");
						} else {
							System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
									+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
									+ slist.get(i).getScoreAndroid() + "\t" + avg + "\t" + "F" + "\n");
						}
						ck = false;
					}

				}
				if (ck) {
					System.out.println("검색할 정보가 없습니다.");
				}

				System.out.print("=============\n");
			}
			else if(x==4) {
				System.out.print("====정보삭제====\n");
				
				System.out.println("이름\t학번\tJava\tAndroid\tWeb");
				for (int i = 0; i < slist.size(); i++) {
					System.out.print(slist.get(i).getName() + "\t" + slist.get(i).getNumber() + "\t"
							+ slist.get(i).getScoreJava() + "\t" + slist.get(i).getScoreWeb() + "\t"
							+ slist.get(i).getScoreAndroid() + "\n");
				}
				if (slist.size() == 0) {
					System.out.print("삭제할 데이터가 없습니다.\n");
				}

				System.out.print("=============\n");
			}

		}

	}

}
