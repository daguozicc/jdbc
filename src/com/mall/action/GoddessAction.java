package com.mall.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mall.dao.GoddessDao;
import com.mall.model.Goddess;

public class GoddessAction {
	public void add(Goddess goddess) throws Exception{
		GoddessDao dao =new GoddessDao();
		dao.addGoddess(goddess);
	}
	public Goddess get(Integer id) throws Exception{
		GoddessDao dao =new GoddessDao();
		return dao.get(id);
	}
	public void edit(Goddess goddess) throws Exception{
		GoddessDao dao =new GoddessDao();
		dao.updateGoddess(goddess);
	}
	public void del(Integer id) throws Exception{
		GoddessDao dao =new GoddessDao();
		dao.delGoddess(id);
	}
	public List<Goddess> query() throws Exception{
		GoddessDao dao =new GoddessDao();
		return dao.query();
	}
	public List<Goddess>query(List<Map<String, Object>> params) throws Exception{
		GoddessDao dao =new GoddessDao();
		return dao.query(params);
	}
	
}
