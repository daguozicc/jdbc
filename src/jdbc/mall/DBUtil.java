package jdbc.mall;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DBUtil {
	private static final String url = "jdbc:mysql://127.0.0.1:3306/imooc";
	private static final String user = "root";
	private static final String password = "root";
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");	
		Connection conn=DriverManager.getConnection(url, user, password);
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
	
		while(rs.next()){
			System.out.println(rs.getString("user_name")+","+rs.getString("age"));
		}
		
	}
}
