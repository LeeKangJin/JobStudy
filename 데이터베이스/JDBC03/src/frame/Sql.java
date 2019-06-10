package frame;

public class Sql {

	//static 은 instance없이 쓸수 있음으로 다음과 같이 모아놓는다.
	
	public static String insertUser = "INSERT INTO T_USER VALUES (?,?,?)";
	
	public static String deleteUser = "DELETE FROM T_USER WHERE ID = ?";
	
	public static String updateUser = "UPDATE T_USER SET PWD=?, NAME=? WHERE ID=?";
	
	public static String selectUser = "SELECT * FROM T_USER WHERE ID =?";
	
	public static String selectAllUser = "SELECT * FROM T_USER ";
	
	

	public static String insertProduct = "INSERT INTO T_PRODUCT VALUES (?,?,?,SYSDATE)";
	
	public static String deleteProduct = "DELETE FROM T_PRODUCT WHERE ID = ?";
	
	public static String updateProduct= "UPDATE T_PRODUCT SET PRICE=?, NAME=? WHERE ID=?";
	
	public static String selectProduct = "SELECT * FROM T_PRODUCT WHERE ID =?";
	
	public static String selectAllProduct = "SELECT * FROM T_PRODUCT ";
	
	
}
