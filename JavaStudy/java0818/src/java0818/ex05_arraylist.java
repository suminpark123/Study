package java0818;

import java.util.ArrayList;

public class ex05_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열타입[] 배열이름(래퍼런스 변수) = new 배열 타입[배열의 크기];
		
		//ArrayList
		//크기가 고정적이 아닌 가변적인 배열 형태를 가진 "클래스"
		//콜렉션: 특정 자료구조를 클래스화 시킨 것(Arraylist,HashMap)
		
		//1. ArrayList 생성
		ArrayList<String> list = new ArrayList<String>(); // -->생성자 구조
		
		//E :엘리먼트 (요소)
		//ArrayList는 요소가 래퍼런스 변수 타입 
		//래퍼런스 변수 타입 : 기본데이터 타입을 제외한 나머지
		//- String String[] 배열타입, class 쿨래스타입
		//<> 제네릭(Generic 기법)
		// 객체를 생성하는 순간에 자료형이 결정되는 기법.
		
		//2. ArrayList 데이터를 추가
 	list.add("김용현");
 	list.add("이주희");
 	list.add("김태현");
 	
 		//3. 특정한 위치에 데이터를 추가하기.
 	
 	list.add(3, "박병관");
 	list.add(4, "이춘수");
 	
 		//ArrayList의 크기를 알아보자
 	
 	System.out.println(list.size());
 	
 		//5. 데이터를 삭제하기
 	list.remove(0);
 	
 	// 6.데이터를 전체삭제
 	list.clear();
 	System.out.println(list.size());
 	
; 	
 	
	}
}