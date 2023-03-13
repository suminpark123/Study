package java0818;

import java.util.ArrayList;

public class ex06_arraylist실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> pList= new ArrayList<Person>();
		
		Person p1= new Person("김용현",20);
		Person p2= new Person("이주희",20);
		Person p3= new Person("김태현",20);
		// Integer 정수형 int쓰면오류
		// Double 실수형 double 쓰면오류
		
		//1. pList에 데이터를 추가
		//여러분들의 짝궁이름, 나이를 가지고 있는 데이터를 추가
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		//plist에 있는 이름 가져오기
		//김용현 데이터 get(0)
		//이주희 데이터 get(1)
//		for(int i=0; i<pList.size(); i++) {
//			System.out.println(pList.get(i).getAge());
//		}
		
		//반복문으로 출력
//		System.out.println(pList.get(2).getName());
//		System.out.println(pList.get(2).getAge());
		for(Person p: pList) {
			System.out.println(p.getName());
		}
		//for-each문은
		//배열 안에 있는 요소를 하나씩 뽑아서 : 좌측에 있는공간에 담아줌
		//이 구조는 배열의 크기만큼 반복을 돌게 됩니다

	}

}
