package ru.voronoy.objectmodel.main;

import java.util.ArrayList;

import ru.voronoy.objectmodel.test.Constraint;

public class Field extends DataBaseObject {
		
	private ArrayList<Constraint> constraints;
	
	public Field(String name){
		super(name);
		this.constraints = new ArrayList<Constraint>();
	}

	public void addConstraint(Constraint testConstraint) {
		this.constraints.add(testConstraint);
		
	}

	public boolean containsConstraint(Constraint testPKconstraint) {
		for (Constraint c : this.constraints){
			if (c.getClass().isInstance(testPKconstraint)){
				return true;
			}
		}
		return false;
	}
		
}
