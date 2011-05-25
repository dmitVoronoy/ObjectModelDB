package ru.voronoy.objectmodel.main;

import java.util.ArrayList;

public class Table extends DataBaseObject {

	private ArrayList<Field> fields = new ArrayList<Field>();
	private ArrayList<Index> indexes = new ArrayList<Index>();

	public Table(String name) {
		super(name);
	}

	public void addField(Field f) {
		this.fields.add(f);

	}

	public int getFieldsCount() {
		return this.fields.size();
	}

	public void addIndex(Index i) {
		this.indexes.add(i);

	}

	public Object getIndexCount() {
		return this.indexes.size();
	}

}
