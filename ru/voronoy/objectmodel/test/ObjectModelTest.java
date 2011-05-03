package ru.voronoy.objectmodel.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ru.voronoy.objectmodel.main.DataBaseManager;
import ru.voronoy.objectmodel.main.DbProperties;
import ru.voronoy.objectmodel.main.Mapper;

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
	public void testSimpleObjectMapping(){
		TestObject test = new TestObject();
		test.setID(1);
		Mapper m = new Mapper();
		m.save(test);
		assertEquals(m.getTablesCount(),1);
	}		
	
	
}
