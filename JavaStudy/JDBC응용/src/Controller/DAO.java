package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.MemberVO;

public class DAO {
	//JDBC에 필요한 객체 생성
	Connection conn =null;
	PreparedStatement psmt = null;
	ResultSet rs =null;
	
	//Controller : View 와 Model을 연결하기 위한 연결고리
	//DAO (Data Access Object) :데이터베이스에 접근하여 해당 로직을
	//수행할 수 있도록 하는 기능
	//테스트
	//동적로딩 및 데이터베이스 연결 메소드
	public void getCon() {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			
		
			conn =DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				//System.out.println("접속 성공");
			}else {
				System.out.println("접속 실패");
			}
			
			
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		} 
	}
	
	private void close() {
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
	
	//[1]회원가입 ->insert
	//-동적로딩
	//-데이터베이스 연결
	//sql문 작성
	//-객체 종료
	public int join(String id,String pw, String nick, int age) {
		int cnt =0;
		try {
		getCon();
		String sql = "insert into MemberInfo values (?,?,?,?)";
		psmt =conn.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, nick);
		psmt.setInt(4, age);
		
		cnt = psmt.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
		
		}
	
	//[2] 로그인
	//id, pw 입력
	//id, pw =db 랑 일치시 로그인
	//만약에 id pw 존재하지않는다면 로그인x
	public boolean login(String id,String pw) {
		try {
		getCon();
		String sql = "select * from memberInfo where id =? and pw =?";
		psmt =conn.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, pw);
		rs = psmt.executeQuery();
		
		if(rs.next()) {
			
			return true;//로그인성공
			}
			return false;
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return false;
		
		}
	//[3]조회
	
	public MemberVO selectOne(String searchid) {
		MemberVO vo = null;
		try {
			getCon();
			String sql ="select * from memberInfo where id = ?";
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, searchid);	
			rs = psmt.executeQuery();
			//ResultSet 갹채눈 Select 구절의 결과를 테이블 형태로 저장하고 있는 객체
			//ResultSet "커서" 개념 존재 "커서" : 맨처음에는 컬럼을 향하고 있습니다
			//아래로 이동이 가능하다(값이 존재한다면) ->실제로 커서를 한칸아래로 이동하고 true반환
			//값이 존재하지않다면 false반환
			if(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				int age =rs.getInt(4);
				vo = new MemberVO(id,pw,nick,age);
				}
			}catch (SQLException e) {
				e.printStackTrace();
				
			}finally {
				close();
			}
			return vo;
	}
	
	//[4]탈퇴
	public int delete(String id) {
		int cnt =0;
		try {
		getCon();
		String sql = "delete from memberInfo where id = ?";
		psmt =conn.prepareStatement(sql);
		psmt.setString(1, id);
		
		
		cnt = psmt.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
		
		}
	
	//조회 리트라이
	
	public ArrayList<MemberVO> select(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	try {
		getCon();
		String sql ="select * from MemberInfo";
		psmt =conn.prepareStatement(sql);	
		rs = psmt.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String nick = rs.getString(3);
			int age =rs.getInt(4);
			MemberVO vo =new MemberVO(id, pw, nick, age);
			list.add(vo);
		}
	}catch (SQLException e) {
		e.printStackTrace();
		
	}finally {
		close();
	}
	return list;
		
	}
	
	
	
	
	
	}
	



	
	
	
	
		
	
	
	

	
	
	//[2]로그인 ->select
	//-동적로딩
	//-데이터베이스 연결
	//sql문 작성
	//-객체 종료
	
	//[3]조회 ->select
	
	
	//[4]탈퇴 ->delete
	//-동적로딩
	//-데이터베이스 연결
	//sql문 작성
	//-객체 종료

