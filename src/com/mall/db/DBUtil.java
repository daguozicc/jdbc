package com.mall.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtil {
	private static final String url = "jdbc:mysql://127.0.0.1:3306/imooc";
	private static final String user = "root";
	private static final String password = "root";
	private static Connection conn=null;
	static{
		try {
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");	
			//2.获得数据库的连接
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return conn;
	}
	public static void main(String[] args) throws Exception{
		//1.加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");	
		//2.获得数据库的连接
		Connection conn=DriverManager.getConnection(url, user, password);
		//3.通过数据库的连接操作数据库，实现增删改查
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
	
		while(rs.next()){
			System.out.println(rs.getString("user_name")+","+rs.getString("age"));
		}
		
	}
}
