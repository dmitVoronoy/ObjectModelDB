package ru.voronoy.objectmodel.main;

public class DataBaseObject {
	
	private String name;
	
	protected DataBaseObject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
