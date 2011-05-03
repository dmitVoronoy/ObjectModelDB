package ru.voronoy.objectmodel.test;

import ru.voronoy.objectmodel.main.Mapable;

public class TestObject implements Mapable {
	
	private int id;
	
	public int getID(){
		return this.id;		
	}
	
	public void setID(int id){
		this.id = id;
	}

}
