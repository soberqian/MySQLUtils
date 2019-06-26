package com.test;

import java.util.List;

import com.db.MYSQLControl;

public class QueryOneColumn {

	public static void main(String[] args)  {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		List<Object> list = control.getListOneBySQL("select month from carsales", "month");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
