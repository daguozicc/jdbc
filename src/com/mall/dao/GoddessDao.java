package com.mall.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mall.db.DBUtil;
import com.mall.model.Goddess;

public class GoddessDao {
	public void addGoddess(){
		Connection  conn = DBUtil.getConnection();
	}
	
	public void updateGoddess(){
		
	}
	public void delGoddess(){
		
	}
	public List<Goddess>query() throws Exception{
		Connection  conn = DBUtil.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
		List<Goddess> gs = new ArrayList<Goddess>();
		Goddess g = null;
		while(rs.next()){
			g = new Goddess();
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			gs.add(g);
		}
		return gs;
	}
	public Goddess get(){
		return null;
	}
}