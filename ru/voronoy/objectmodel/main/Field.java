package ru.voronoy.objectmodel.main;

import java.util.ArrayList;


public class Field extends DataBaseObject {
		
	private ArrayList<Constraint> constraints;
	
	public Field(String name){
		super(name);
		this.constraints = new ArrayList<Constraint>();
	}

	public void addConstraint(Constraint constraint) {
		if (this.constraints.isEmpty()){
			this.constraints.add(constraint);			
		}			
		if (constraint instanceof KeyConstraint){
			this.constraints.add(new NotNullConstraint());
		}
	}

	public boolean containsConstraint(Constraint constraint) {
		for (Constraint c : this.constraints){
			if (c.getClass().isInstance(constraint)){
				return true;
			}
		}
		return false;
	}
		
}
