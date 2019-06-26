package com.test;

import java.util.List;

import com.db.MYSQLControl;
import com.model.CarSaleModel;

public class QueryMultColumn {

	public static void main(String[] args) {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		List<CarSaleModel> listData = control.getListInfoBySQL("select month, sales from carsales", CarSaleModel.class);
		for (CarSaleModel model : listData) {
			System.out.println(model.getMonth() + "\t" + model.getSales());
		}
	}
}
