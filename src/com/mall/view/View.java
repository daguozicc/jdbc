package com.mall.view;

import java.util.Scanner;

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
			while(scan.hasNext()){
				String in = scan.next().toString();
				if(OPENATION_EXIT.equals(in.toUpperCase())||OPENATION_EXIT.substring(0,1).equals(in.toUpperCase())){
					System.out.println("退出");
					break;
				}
				System.out.println("输入的值为"+scan.next().toString());
			}
		}
}
