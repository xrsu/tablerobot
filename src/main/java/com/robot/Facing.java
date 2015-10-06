package com.robot;

public enum Facing {
	/**
	 * //expand in part2
			put(45,FACING_NORTH_EAST);
			put(135,FACING_NORTH_WEST);
			put(225,FACING_SOUTH_WEST);
			put(315,FACING_SOUTH_EAST);
	 */
	EAST(0), NORTH(90), WEST(180), SOUTH(270),NORTHEAST(45),NORTHWEST(135),SOUTHWEST(225),SOUTHEAST(315);
	
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
