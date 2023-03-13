package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03회원조회 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs= null;
		//finally에서 데이터베이스 자원반납을 위해
		//전역변수로
		//ResultSet 테이블과 같은형태
		try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		
			//Query문 전송
			//sql문장 준비
			//이걸 치게되면
			String sql ="select * from student";
			psmt = conn.prepareStatement(sql);
			//물음표 인자가 있다면 담아주기
			//쿼리문 전송
			rs = psmt.executeQuery();
			//select 구문 나오면 excuteQuery쓰자.
			//반복문을 돌기, 왜? 테이블 데이터 조회
			while(rs.next()) {
				//->데이터가 없다면
				//rs.next()가 false
				//반복문 종료
				String name =rs.getString("name");
				int age = rs.getInt("age");
				String gender =rs.getString("gender");
				System.out.println(name +"\t"+age+"\t"+gender+"\t");
				
			}
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
