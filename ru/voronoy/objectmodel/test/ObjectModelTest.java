package ru.voronoy.objectmodel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.voronoy.objectmodel.main.Table;


public class ObjectModelTest {

	@Test
	public void testFirst(){
		Table table = new Table();
		assertNotNull(table);
	}
}
