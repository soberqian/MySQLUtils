package com.test;

import com.db.MYSQLControl;

public class CreateTable {

	public static void main(String[] args) {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		String sql = "CREATE TABLE newcarsales " +
                "(month varchar(50), " +
                "sales varchar(255), " + 
                " PRIMARY KEY ( month ))"; 
		control.executeUpdate(sql);
	}
}
