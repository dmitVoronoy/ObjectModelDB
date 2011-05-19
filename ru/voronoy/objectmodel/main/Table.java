package ru.voronoy.objectmodel.main;

import java.util.ArrayList;


public class Table {
	private String name;
	private ArrayList<Field> fields = new ArrayList<Field>();
	
	public Table(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addField(Field f) {
		this.fields.add(f);
		
	}

	public int getFieldsCount() {
		return this.fields.size();
	}

}
