package com.mall.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mall.action.GoddessAction;
import com.mall.model.Goddess;

public class TestAction {
    public static void main(String[] args) throws Exception{
    	GoddessAction action = new GoddessAction();
  
    	
    	Goddess g = new Goddess();
    	g.setUser_name("小小1");
    	g.setSex(1);
    	g.setAge(25);
    	g.setBirthday(new Date());
    	g.setEmail("ddd@123.com");
    	g.setMobile("1234566789");
    	g.setIsdel(0);
    	g.setId(5);
    	//action.add(g);
    	//action.edit(g);
    	//action.del(5);
      
    	
    	//参数查询
    	List<Map<String,Object>> params = new ArrayList<Map<String,Object>>();
    	Map<String,Object> map = new HashMap<String, Object>();
    	map.put("name", "user_name");
    	map.put("rel", "=");
    	map.put("value", "'小灰灰'");
    	params.add(map);
    	//查询
    	 List<Goddess> result = action.query();
    	for(int i=0;i<result.size();i++){
    		//System.out.println(result.get(i).getId()+":"+result.get(i).getUser_name());
    	}
    }
}
