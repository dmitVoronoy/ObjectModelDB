package ru.voronoy.objectmodel.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ru.voronoy.objectmodel.main.DataBaseManager;
import ru.voronoy.objectmodel.main.DbProperties;
import ru.voronoy.objectmodel.main.Field;
import ru.voronoy.objectmodel.main.Table;

public class ObjectModelTest {

	DataBaseManager dbManager = new DataBaseManager();
	DbProperties testDbProperties = new DbProperties();
	
	@Test
	public void testCreateDataBase(){
		testDbProperties.setDataBaseName("testDataBase");
		dbManager.createDataBase(testDbProperties);
		assertTrue(dbManager.foundDataBase("testDataBase"));
	}
	
	@Test
	public void testCreateTable(){
		Table t = new Table("testTable");
		assertEquals(t.getName(), "testTable");
	}
	
	@Test
	public void testGetTableFieldsCount(){
		Table t = new Table("testTable");
		Field f = new Field("testField");
		t.addField(f);
		assertEquals(t.getFieldsCount(),1);
	}
	
	
}
