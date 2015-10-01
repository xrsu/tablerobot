package com.robot.impl;

import com.robot.Constants;
import com.robot.IRotate;
import com.robot.RobotInfo;
import com.robot.Utils;
import com.robot.Facing;

public class RotateLeft implements IRotate {
	
	private RobotInfo robotInfo;
	
	public RotateLeft(RobotInfo robotInfo){
		this.robotInfo = robotInfo;
	}

	@Override
	public void rotate() {
		
		Integer curDegree = robotInfo.getFacing().getDegree();
		
		curDegree = curDegree + 90;
		curDegree = Utils.fixDegree(curDegree);
		robotInfo.setFacing(Facing.valueOfDegree(curDegree));
		
	}

}
