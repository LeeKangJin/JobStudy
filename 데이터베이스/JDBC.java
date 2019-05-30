package DB1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args)  {
		
		//JDBC 외부 라이브러리 가져온뒤.
		
		//1. JDBC Driver Loading
		try {
			//여기서 db를 교체해주면됨 (Maria, Oracle 등등)
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
			e.printStackTrace();
		}
		// Connection. 1521번 port (DB - Server)  
		String id = "db";
		String password = "db";
		String ip = 
				"jdbc:oracle:thin:@70.12.50.230:1521:xe";// JDK 규칙 db마다 다름.
		
		
		//2. Connection
		Connection con = null;
		try {
			con = DriverManager.getConnection(ip,id,password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Conection Error");
			e.printStackTrace();
		}
		
		//3. SQL어 사용
		String sql = "INSERT INTO T_USER VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "id999"); //1번째 물음표에 값 생성
			pstmt.setString(2, "pwd20"); // 2번째 ...
			pstmt.setString(3, "말숙이");
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. close
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
