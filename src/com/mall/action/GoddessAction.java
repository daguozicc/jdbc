package com.mall.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mall.dao.GoddessDao;
import com.mall.model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception{
		GoddessDao g = new GoddessDao();
		
//		List<Goddess> result = g.query("美洋洋","13","xi");
		List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("name", "user_name");
		param.put("rela", "like");
		param.put("value", "'%美洋洋%'");
		param = new HashMap<String, Object>();
		param.put("name", "mobile");
		param.put("rela", "=");
		param.put("value", "'133'");
		params.add(param);
		List<Goddess> result = g.query(params);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i).toString());
		}
		List<Goddess> gs=g.query();
		for(Goddess goddess:gs){
			//System.out.println(goddess.getUser_name()+","+goddess.getAge());
		}
		Goddess g1 = new Goddess();
		g1.setUser_name("小果果");
		g1.setAge(2);
		g1.setSex(1);
		g1.setBirthday(new Date());
		g1.setEmail("yzcxiaozhi@126.com");
		g1.setMobile("136595656");
		g1.setUpdate_user("admin");
		g1.setIsdel(1);
		g1.setId(3);
		//g.addGoddess(g1);
		//g.updateGoddess(g1);
		//g.delGoddess(3);
		Goddess g2 = g.get(2);
		//System.out.println(g2.toString());
	}
}
