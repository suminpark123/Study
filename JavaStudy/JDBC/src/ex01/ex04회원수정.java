package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex04회원수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //update student set age = '25' where name = '정세연';
	

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs= null;
		
		Scanner sc = new Scanner(System.in);
		
		try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		
			
			
//			System.out.println("성별 입력 :");
//			String gender = sc.next();
			System.out.println("나이 입력 :");
			int age = sc.nextInt();
			//Query문 전송
			//sql문장 준비
			//이걸 치게되면
			String sql ="update student set age = ? where name = '채수민'";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, age);
		
		//	rs = psmt.executeQuery();
			//물음표 인자가 있다면 담아주기
		//	psmt.setString(1, name);
			//쿼리문 전송
			
			int row = psmt.executeUpdate();
			
			if(row>0) {
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
			}
			
			
			//select 구문 나오면 excuteQuery쓰자.
			//반복문을 돌기, 왜? 테이블 데이터 조회
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 개발할때 사용하는 코드
			System.out.println("오류가 발생했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터 베이스 관련 오류");
		} finally {
			// 중간에 예외상황이 발생하더라도 무조건 한번은 실행
			// 닫기(데이터 베이스 자원반납)
			// rs-> psmt->conn
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null);
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("자원 반납 시 오류");
			}
		
		} 
	}

}

	
	
	
	
	
	
	
	

