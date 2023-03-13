package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	//Connection 하는 메소드
	private Connection conn;
	private void getConnection() {
		try {
			//try-catch : 예외사항이 발생할 만한 부분을 해결하는 방법
			//예외사항이 발생할 것 같은 부분의 코드를 try{}안에 작성
			//예외사항이 발생하면 catch문으로 이동
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2 커넥션 연결
			//이 단계에서는 드라이버가 연결을 도와준다.
			// 연결할때 URL주소 (DB주소/계정이름/비밀번호)
			String db_url ="jdbc:oracle:thin:@localhost:1521:xe" ;
			String db_id = "hr";
			String db_pw = "hr";
			
			conn =DriverManager.getConnection(db_url,db_id,db_pw);
			//동적으로 클래스 로드하기 위해서
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	

	
}
