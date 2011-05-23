package ru.voronoy.objectmodel.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import ru.voronoy.objectmodel.main.DataBaseManager;
import ru.voronoy.objectmodel.main.DbProperties;
import ru.voronoy.objectmodel.main.Field;
import ru.voronoy.objectmodel.main.Table;
import ru.voronoy.objectmodel.main.View;

public class ObjectModelTest {

	DataBaseManager dbManager = new DataBaseManager();
	DbProperties testDbProperties = new DbProperties();
	Table testTable;
	Field testField;
	Index testIndex;
	Constraint testPKconstraint;
	Constraint testFKconstraint;
	
	@Before
	public void setUp(){
		testTable = new Table("testTable");
		testField = new Field("testField");
		testIndex = new Index("testIndex");
		testPKconstraint = new PrimaryKeyConstraint("testPK");
		testFKconstraint = new ForeignKeyConstraint("testFK");
	}
	
	@Test
	public void testCreateDataBase(){
		testDbProperties.setDataBaseName("testDataBase");
		dbManager.createDataBase(testDbProperties);
		assertTrue(dbManager.foundDataBase("testDataBase"));
	}
	
	@Test
	public void testCreateTable(){
		assertEquals(testTable.getName(), "testTable");
	}
	
	@Test
	public void testGetTableFieldsCount(){
		testTable.addField(testField);
		assertEquals(testTable.getFieldsCount(),1);
	}
	
	@Test
	public void testCreateView(){
		View v = new View("testView");
		assertEquals(v.getName(),"testView");
	}
	
	@Test
	public void testCreateIndex(){		
		assertEquals(testIndex.getName(), "testIndex");
	}
	
	@Test 
	public void testAddIndexToTable(){
		testTable.addIndex(testIndex);
		assertEquals(testTable.getIndexCount(),1);
	}
	
	@Test
	public void testCreatePimaryKeyConstraint(){
		testField.addConstraint(testPKconstraint);
		assertTrue(testField.containsConstraint(testPKconstraint));
	}
	
	@Test
	public void testCreateForegnKeyConstraint(){
		testField.addConstraint(testFKconstraint);
		assertTrue(testField.containsConstraint(testFKconstraint));
	}
	
	@Test
	public void testContainsConstraint(){		
		testField.addConstraint(testPKconstraint);
		assertFalse(testField.containsConstraint(testFKconstraint));
		assertTrue(testField.containsConstraint(testPKconstraint));
	}
	
	
	
}
