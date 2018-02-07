package com.mall.view;

import java.util.Scanner;

import com.mall.action.GoddessAction;
import com.mall.model.Goddess;

public class View {
	private static final String CONTEXT="huanx";
		private static final String OPERATION_MAIN="MAIN";
		private static final String OPENATION_QUERY="QUERY";
		private static final String OPENATION_GET="GET";
		private static final String OPENATION_ADD="ADD";
		private static final String OPENATION_UPDATE="UPDATE";
		private static final String OPENATION_EDLETE="EDLETE";
		private static final String OPENATION_SEARCH="SEARCH";
		private static final String OPENATION_EXIT="EXIT";
		private static final String OPENATION_BREAK="BREAK";
		public static void main(String[] args){
			System.out.println(CONTEXT);
			Scanner scan = new Scanner(System.in);
			Goddess goddess = new Goddess();
			GoddessAction action = new GoddessAction();
			String prenious = null;
			Integer step=1;
			while(scan.hasNext()){
				String in = scan.next().toString();
				if(OPENATION_EXIT.equals(in.toUpperCase())||OPENATION_EXIT.substring(0,1).equals(in.toUpperCase())){
					System.out.println("退出");
					break;
				}else if(OPENATION_ADD.equals(in.toUpperCase())||OPENATION_ADD.substring(0,1).equals(in.toUpperCase())||
						OPENATION_ADD.equals(prenious)
						){
					prenious = OPENATION_ADD;
					if(1==step){
						System.out.println("请输入女神的名字");
					}else if(2==step){
						goddess.setUser_name(in);
						System.out.println("请输入女神的年龄");
					}else if(3==step){
						goddess.setAge(Integer.valueOf(in));
						System.out.println("请输入女神的年龄");
					}
					if(OPENATION_ADD.equals(prenious)){
						step++;
					}
					
				}else{
					System.out.println("输入的值为"+in);
				}
				//System.out.println("输入的值为"+scan.next().toString());
			}
		}
}
