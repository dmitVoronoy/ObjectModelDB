package ru.voronoy.objectmodel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.voronoy.objectmodel.main.DataBaseManager;
import ru.voronoy.objectmodel.main.DbProperties;
import ru.voronoy.objectmodel.main.Table;


public class ObjectModelTest {

	DataBaseManager dbManager = new DataBaseManager();
	DbProperties testDbProperties = new DbProperties();
	
	@Test
	public void testFirst(){
		Table table = new Table();
		assertNotNull(table);
	}
	
	@Test
	public void testCreateDataBase(){
		testDbProperties.SetDataBaseName("testDataBase");
		dbManager.CreateDataBase(testDbProperties);
		assertTrue(dbManager.FoundDataBase("testDataBase"));
	}
}
