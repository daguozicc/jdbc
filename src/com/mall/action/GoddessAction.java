package com.mall.action;

import java.util.Date;
import java.util.List;

import com.mall.dao.GoddessDao;
import com.mall.model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception{
		GoddessDao g = new GoddessDao();
		List<Goddess> gs=g.query();
		for(Goddess goddess:gs){
			System.out.println(goddess.getUser_name()+","+goddess.getAge());
		}
		Goddess g1 = new Goddess();
		g1.setUser_name("Ð¡¹û¹û");
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
		System.out.println(g2.toString());
	}
}
