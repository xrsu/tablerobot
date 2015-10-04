package com.robot;

import java.util.ArrayList;
import java.util.List;

public class RobotInfo implements Cloneable{

	private int x;
	private int y;
	private Facing facing;
	private int maxUnits;
	//if there will be a undo function,will use this property
	private List<String> commandArray = new ArrayList<String>();
	private boolean isPlaced = false;
	
	public RobotInfo(){
		
	}
	
	public void setRobotInfo(String[] inputParamArray){
		this.x = Integer.parseInt(inputParamArray[0]);
		this.y = Integer.parseInt(inputParamArray[1]);
		this.facing = Facing.valueOf(inputParamArray[2]);
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Facing getFacing() {
		return facing;
	}
	public void setFacing(Facing facing) {
		this.facing = facing;
	}
	public int getMaxUnits() {
		return maxUnits;
	}
	public void setMaxUnits(int maxUnits) {
		this.maxUnits = maxUnits;
	}
	public List<String> getCommandArray() {
		return commandArray;
	}
	public void setCommandArray(List<String> commandArray) {
		this.commandArray = commandArray;
	}
	
	public void addCommandArray(String command){
		this.commandArray.add(command);
	}
	
	public void clearCommandArray(){
		this.commandArray.clear();
	}

	public boolean isPlaced() {
		return isPlaced;
	}

	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}
	public String toString(){
		return String.format("%s, %s, %s", x, y, facing);
	}
	
	public RobotInfo clone() {
		RobotInfo o = null;
		try {
			o = (RobotInfo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}
