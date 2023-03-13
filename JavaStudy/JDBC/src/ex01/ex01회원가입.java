package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01회원가입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement psmt = null;
		Scanner sc = new Scanner(System.in);

		// JDBC
		// ->java DateBase Connectivity
		// ->수많은 인터페이스들로 코드가 구성되어져 있음

		// JDBC 연결과정
		// 1. 데이터베이스 연결
		// 1-1드라이버 동적로딩
		// 동적로딩 ->실행되는 순간에 자료형이 결졍되는 것을 말한다.
		// try-catch문
		// try : 일단 무조건 한번실행하는 구문
		// catch : (잡다) try구문안에서 Exception(예외) 발생시
		// 어떤 로직을 실행해줄지 결정하는구간
		// ClassNotFoundException ->Ojdbc6.jar 안들어왔을때 오류

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// forName(메소드) ->기울임꼴 ->static(정적인 저장공간)
			// 실행하는 순간에 가장 먼저 로딩되는 공간 = static
			// 객체를 별도로 생성하지 않아도 사용 가능
			// 저장공간의 크기가 매우작다. 함부로 사용하면 x

			// ->어떤 데이터베이스의 드라이버를 가져올건지 정해주ㅝ야 한다.
			// oracle.jdbc.driver -> 패키지명
			// OracleDriver -> 클래스명

			// 1-2 데이터베이스 연결
			// 연결하기 위한 준비물
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// jdbc:oracle:thin ->오라클의 thin Driver
			// @localhost -> ip주소(내컴퓨터 ip주소의 키워드)
			// 1521 ->port number
			// xe : db별칭
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			System.out.print("ID 입력: ");
			String id = sc.next();
			System.out.print("PW 입력 :");
			String pw = sc.next();
			System.out.println("이름 입력 :");
			String name = sc.next();
			System.out.println("나이 입력 :");
			int age = sc.nextInt();
			System.out.println("성별 입력 :");
			String gender = sc.next();
//		
			// 2.Query문(sql)전송
			String sql = "insert into student values(?,?,?)";

			// 2-2 sql문 전송
			psmt = conn.prepareStatement(sql);
			// -- > sql 구문을 양삭에 맞게 담아주는 작업

			// 물음표(?)인자를 채워주는 작업
			psmt.setString(1, name);
			psmt.setInt(2, age);
			psmt.setString(3, gender);

			int row = psmt.executeUpdate();
			// sql문을 전송 =>영향을 받은 행의 개수로 결과를 받아옴

			// 3. 결과를 이용해 작업처리
			if (row > 0) {
				System.out.println("데이터 입력 성공");
			} else {
				System.out.println("데이터 입력 실패");
			}

			// 모든 Exception(예외) 관련된 클래스는 Exception Class를 상속 받습니다
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 개발할때 사용하는 코드
			System.out.println("오류가 발생했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터 베이스 관련 오류");
		} finally {
			// 중간에 예외상황이 발생하더라도 무조건 한번은 실행
			// 닫기(데이터 베이스 자원반납)
			// conn, psmt
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					;
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("자원 반납 시 오류");
			}
		}

	}

}
