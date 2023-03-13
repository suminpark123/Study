package java0823;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> alist = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료>>");
			int x = sc.nextInt();

			if (x == 5) {
				System.out.println("프로그램종료");
				break;
			} else if (x == 1) {
				System.out.print("이름 : ");
				String a = sc.next();
				System.out.print("나이 : ");
				int b = sc.nextInt();
				System.out.print("전화번호 : ");
				String c = sc.next();
				Address p = new Address(a, b, c);
				alist.add(p);

			} else if (x == 2) {
				for (int i = 0; i < alist.size(); i++) {
					System.out.println(i + 1 + "." + alist.get(i).getName() + "(" + alist.get(i).getAge() + "세)" + " : "
							+ alist.get(i).getPhoneNumber());
				}

				if (alist.size() == 0) {
					System.out.print("등록된 연락처가 없습니다.\n");

				}
			} else if (x == 3) {
				for (int i = 0; i < alist.size(); i++) {
					System.out.println(i + 1 + "." + alist.get(i).getName() + "(" + alist.get(i).getAge() + "세)" + " : "
							+ alist.get(i).getPhoneNumber());
				}
				System.out.println("삭제할 번호 입력 : ");

				int num = sc.nextInt();
				alist.remove(num - 1);
			} else if (x == 4) {
				System.out.print("검색할 이름 : ");
				String str = sc.next();
				boolean ck = false;
				for (int i = 0; i < alist.size(); i++) {
					// System.out.println(i+1+"."+alist.get(i).getName()+"("+alist.get(i).getAge()+"세)"+"
					// : "+alist.get(i).getPhoneNumber());
					if (alist.get(i).getName().equals(str)) {
						System.out.println(i + 1 + "." + alist.get(i).getName() + "(" + alist.get(i).getAge() + "세)"
								+ " : " + alist.get(i).getPhoneNumber());
						ck = true;
					}

				}

				if (ck == false) {
					System.out.println("검색한 정보가 없습니다.");
				}

			}

		}

	}
}