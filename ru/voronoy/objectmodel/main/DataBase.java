package ru.voronoy.objectmodel.main;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private List<Table> tables;
	private String name;

	public DataBase(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
