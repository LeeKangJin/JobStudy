package frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// c+s+o
import java.util.ArrayList;

//Biz 에서 Connection 및 Transaction 처리
public abstract class Biz<K,V> {

	
	String id;
	String pwd;
	String url;
	
	public Biz() {
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
			e.printStackTrace();
		}
		
		id = "db";
		pwd = "db";
		url = 
				"jdbc:oracle:thin:@70.12.50.230:1521:xe";
		
	}
	
	public Connection getCon() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			
			//오토 커밋 끄고 transcation 수동 관리. 
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	public void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public abstract void register(V v) throws Exception;
	
	public abstract void remove(K k) throws Exception;
	
	public abstract void modify(V v) throws Exception;
	
	public abstract V get(K k) throws Exception;
	
	public abstract ArrayList<V> get() throws Exception;
	
	
}
