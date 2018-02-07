package com.mall.action;

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
	}
}
