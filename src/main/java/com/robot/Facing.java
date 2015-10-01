package com.robot;

public enum Facing {
	
	EAST(0), NORTH(90), WEST(180), SOUTH(270);
	
	private int degree;
	private Facing(int degree){
		this.degree = degree;
	}
	
	public int getDegree(){
		return degree;
	}
	
	public static Facing valueOfDegree(int degree){
		for(Facing facing:Facing.values()){
			if(facing.getDegree()==degree)
				return facing;
		}
		
		throw new IllegalArgumentException("Degree is invalid");
	}
}
