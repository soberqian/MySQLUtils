package com.test;

import com.db.MYSQLControl;

public class UpdateData {

	public static void main(String[] args) {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		control.executeUpdate("update carsales set sales = '4000' "
				+ "where month = '2007-10-01'");
		System.out.println("finish updating!");
		
	}
}
