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
		if (constraint instanceof PrimaryKeyConstraint){
			this.constraints.add(new UniqueConstraint());
		}
	}
	
	public void addConstraint(KeyConstraint constraint){
		this.addConstraint((Constraint)constraint);		
		this.constraints.add(new NotNullConstraint());
	}

	public boolean containsConstraint(Constraint constraint) {
		for (Constraint c : this.constraints){
			if (c.getClass().isInstance(constraint)){
				return true;
			}
		}
		return false;
	}

	public void removeConstraint(Constraint removingConstraint) {		
		for (Constraint c : this.constraints){
			if (c.getClass().isInstance(removingConstraint)){
				this.constraints.remove(c);
				return;
			}
		}
	}
		
}
