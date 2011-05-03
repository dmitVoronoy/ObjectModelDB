package ru.voronoy.objectmodel.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.voronoy.objectmodel.test.TestObject;

public class Mapper {

	List<Table> tables; 
	
	public Mapper(){
		this.tables = new ArrayList<Table>();
	}
	
	public void save(Mapable object) {
		tables.add(new Table(object.getClass().getName()));
		//TODO remove foreach
		for (Table t : tables){
			System.out.println(t.getName());
		}		
	}

	public Object getTablesCount() {
		return this.tables.size();
	}

}
