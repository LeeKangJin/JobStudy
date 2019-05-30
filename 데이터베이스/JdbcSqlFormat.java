
/*
  각 영역에 대한 EXCEPTION 처리 필요 
*/

//1. JDBC Driver Loading
  //change each database struct

	Class.forName("oracle.jdbc.driver.OracleDriver");
  
//2. Connection

String id = "db";
		String password = "db";
		String ip = "jdbc:oracle:thin:@70.12.50.230:1521:xe";// JDK 규칙 db마다 다름.

Connection con = DriverManager.getConnection(ip,id,password);


//3. Write SQL

  //select each sql grammer
 String sql = "SELECT * FROM T_USER WHERE ID=?";
 
 String sql = "INSERT INTO T_USER VALUES (?,?,?)";
 
 String sql = "UPDATE T_USER SET PWD=?,Name=? WHERE ID=?";
 
 String sql = "DELETE FROM T_USER WHERE ID=?";
 
 
 PreparedStatement pstmt = null;
 ResultSet rset = null; //return value 
 
 pstmt = con.prepareStatement(sql);
 
  pstmt.setString(1, "id01"); //1번째 물음표에 값 생성
  pstmt.setString(2,"pwd"); //2번째 물음표 ...
  
  
  //if Select SQL grammer
  int result = pstmt.executeUpdate();
  rset = pstmt.executeQuery(); //select 할시 결과 값 받는 곳 
  rset.next();// 포인터 이동해야함.
  
  String newid = rset.getString("ID"); //id 값 저장
  String newpwd = rset.getString("PWD"); //pwd값 저장..
  String newname = rset.getString("NAME");
 
  //4. close
  pstmt.close();
  con.close();
  rset.close();
