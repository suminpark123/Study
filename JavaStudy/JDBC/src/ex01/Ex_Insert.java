package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//jdbc 연결순서
		//0.(선행작업)프로젝트 내에 ojdbc6.jar 연결하기
		//1. jdbc드라이버 연결(동적로딩)
		//2.데이터베이스 연결 작업
		//3.sql 작성 및 전송 작업
		//4.사용한 객체에 대한 연결 종료 작업
		Scanner sc=new Scanner(System.in);	
		
		PreparedStatement psmt =null;
		
		Connection conn =null;
		
		try {
			//1. jdbc 드라이버 연결 작업
			//Class.forName():클래스 이름을 기준으로 파일을 찾아오는 메소드
			Class.forName("oracle.jdbc.driver.OracleDriver");//연결다리
			
			//2.데이터베이스 연결 작업
			
			// 데이터 베이스 연결에 필요한 정보 정리!
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String db_id="hr";
			String db_pw="hr";
			
			conn =DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn !=null) {
				System.out.println("접속 성공");
			}else {
				System.out.println("접속 실패");
			}
			
			//3. sql문 작성 및 전송
			//insert 작업 진행 '채수민',20,'여성' =>student table
			
			//사용자가 달라지면 입력하는 내용도 달라져야하므로
			//사용자로부터 입력값 받기
			
			System.out.print("이름 : ");
			String name =sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("성별 : ");
			String gender =sc.next();
			
			String sql = "insert into student values(?, ?, ?)";
			
			psmt=conn.prepareStatement(sql);//전송
			
			//사용자가 입력한 값과 sql문 연결하기
			psmt.setString(1, name);
			psmt.setInt(2, age);
			psmt.setString(3, gender);
			
			
			//만들어진 sql문 실제 실행하기
			int result=psmt.executeUpdate();
			
			if(result >0) {
				System.out.println("삽입 성공");
			}else {
				System.out.println("삽입 실패");
			}	
				
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 연결 오류!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스 연결 오류!");
		}
		
		//4.연결 종료
		finally {
			//마지막에 반드시 수행하기 위한 키워드!
			//객체를 닫는건 사용된 순서의 역순
			// Connection(conn)-> PreparedStatement(psmt)
				try {
					if(psmt !=null) {
					psmt.close();
					}if(conn != null) {
						conn.close();
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		
		
		
	}

}
