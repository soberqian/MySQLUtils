package com.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import com.db.MYSQLControl;
import com.model.CarSaleModel;

public class InsertListData {

	public static void main(String[] args) {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		List<CarSaleModel> saleList = new ArrayList<CarSaleModel>();
		CarSaleModel model1 = new CarSaleModel();
		model1.setMonth("2007-01-01");
		model1.setSales("14834");
		CarSaleModel model2 = new CarSaleModel();
		model2.setMonth("2007-02-01");
		model2.setSales("9687");
		//add data
		saleList.add(model1);
		saleList.add(model2);
		try {
			control.insertListData(saleList, "newcarsales");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
