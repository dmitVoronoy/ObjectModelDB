package ru.voronoy.objectmodel.test;

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
	Constraint testConstraint;
	
	@Before
	public void setUp(){
		testTable = new Table("testTable");
		testField = new Field("testField");
		testIndex = new Index("testIndex");
		testConstraint = new Constraint("testConstraint");
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
	public void testCreateConstraint(){
		assertEquals(testConstraint.getName(), "testConstraint");
	}
	
	@Test
	public void testAddConstraintToField(){
		testField.addConstraint(testConstraint);
		assertTrue(testField.containsConstraint(testConstraint));
	}
	
	@Test
	public void testCreatePimaryKeyConstraint(){
		Constraint testPKconstraint = new PrimaryKeyConstraint("testPK");
		testField.addConstraint(testPKconstraint);
		assertTrue(testField.containsConstraint(testPKconstraint));
	}
	
}
