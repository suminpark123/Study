package ex01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class ex02회원삭제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		Connection conn = null;
		PreparedStatement psmt = null;
		// 회원 삭제 기능
		// 이름을 입력 받았을 떄 입력받은 이름과
		// 일치하는 데이터만 삭제
		// 1. 데이터베이스 연결
		// 1-1) 드라이버 동적 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 2. SQL문 전송
			// 2-1) sql문 준비
			String sql = "delete from student where name = ?";
			// 2-2) sql문 전송
			// 3. 작업 처리
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("데이터 삭제 성공");
			} else {
				System.out.println("데이터 삭제 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 개발할떄 사용하는 코드
			System.out.println("오류가 발생하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 관련 오류");
			// 4. 닫기.
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("자원반납시 오류");
			}
		}
	}
}
