package ru.voronoy.objectmodel.main;

import java.util.LinkedList;
import java.util.List;

public class DataBaseManager {

	private List<String> dataBases;
	
	public DataBaseManager(){
		dataBases = new LinkedList<String>();
	}
	
	public void createDataBase(DbProperties properties) {
		// TODO Auto-generated method stub
		dataBases.add(properties.getDataBaseName());
	}

	public boolean foundDataBase(String dbName) {
		// TODO correct implementation
		if (dataBases.contains(dbName)){
			return true;
		}
		return false;
	}

}
