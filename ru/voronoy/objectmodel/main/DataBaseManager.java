package ru.voronoy.objectmodel.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataBaseManager {

	private List<DataBase> dataBases;
	
	public DataBaseManager(){
		dataBases = new ArrayList<DataBase>();
	}
	
	public void createDataBase(DbProperties properties) {
		// TODO Auto-generated method stub
		dataBases.add(new DataBase(properties.getDataBaseName()));
	}

	public boolean foundDataBase(String dbName) {
		// TODO correct implementation
		for (DataBase db : this.dataBases) {
			if (db.getName().equals(dbName)){
				return true;
			}
		}
		return false;
	}

}
