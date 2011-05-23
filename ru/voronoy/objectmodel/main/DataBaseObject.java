package ru.voronoy.objectmodel.main;

public abstract class DataBaseObject {
	
	private String name;
	
	protected DataBaseObject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
