package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.DAO;
import Model.MemberVO;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//view =>사용자가 메뉴를 선택하고 필요한 정보들을 입력할수있는 공간
		Scanner sc =new Scanner(System.in);
		//DAO 클래스에 접근할수있는 객체생성
		//서로다른 패키지에 있을경우 import작업 필요
		DAO dao =new DAO();
		while(true) {
			System.out.print("[1짭]회원가입 [2]로그인 [3]조회 [4]탈퇴 [5]종료>>");
			int menu=sc.nextInt();
			
			if(menu==1) {
				//회원가입 기능 연결
				System.out.println("==========등록==========");
				System.out.print("ID : ");
				String id =sc.next();
				System.out.print("PW : ");
				String pw =sc.next();
				System.out.print("nick : ");
				String nick =sc.next();
				System.out.print("나이 : ");
				int age =sc.nextInt();
				int cnt=dao.join(id,pw,nick,age);
				if(cnt >0) {
					System.out.println("등록 성공");
				}
				else {
					System.out.println("등록 실패");
				}
			}
			else if(menu==2) {
				//로그인 기능 연결
				System.out.print("ID :");
				String id =sc.next();
				System.out.print("PW : ");
				String pw =sc.next();
				boolean res=dao.login(id,pw);
				if(res == true) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}
			else if(menu==3) {
				//조회 기능 연결
				ArrayList<MemberVO> list=dao.select();
				for(int i=0; i<list.size(); i++) {
					System.out.print(list.get(i).getId()+"\t");
					System.out.print(list.get(i).getPw()+"\t");
					System.out.print(list.get(i).getNick()+"\t");
					System.out.println(list.get(i).getAge()+"\t");
				}
				
			}
			else if(menu==4) {
				//탈퇴 기능 연결
				System.out.print("ID :");
				String id =sc.next();
				int x=dao.delete(id);
				if(x>0) {
					System.out.println("탈퇴 성공");
				}else {
					System.out.println("탈퇴 실패");
				}
				
			}
			else if(menu==5) {
				break;
			}
		}

	}

}
