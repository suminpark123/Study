package ex05;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 실제 인형뽑기 머신이 돌아갈 수 있는 클래스
		Machine m = new Machine();
		
		//1.머신에 들어갈 인형의 객체 생성해주기
		Pika pika =new Pika();
	//	Doll d = new Doll();
		
		//2.생성된 객체를 머신에 포함하여 기계실행하기
		m.pic(pika);
		
		Pairi pairi =new Pairi();
		
		m.pic( pairi);
		
		Kkobuk kkobuk =new Kkobuk();
		
		m.pic(kkobuk);
		
		// 새로운 인형이 추가된다면 해당하는 인형에 대해
		// 뽑을수 있는 기능이 Machine에 계속 추가되어야한다.
		
		//피카츄,파이리,꼬부기 > 공통점 "인형" 이다
		//어떤 인형이든 machine에 인형이 들어오면 뽑을 수 있는 기계를 생성하자
		
		//machine(피카츄)/machine(파이리) > machine (인형)
		
		
		
		Doll[] dolls = {pika,pairi,kkobuk};
		Random rd =new Random();
		
		int num =rd.nextInt(3);
		
		
		m.pic(dolls[num]);
		
	}

}
