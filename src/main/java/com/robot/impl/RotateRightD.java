package com.robot.impl;

import com.robot.Facing;
import com.robot.IRotate;
import com.robot.RobotInfo;
import com.robot.Utils;

public class RotateRightD implements IRotate {
	
	private RobotInfo robotInfo;
	
	public RotateRightD(RobotInfo robotInfo){
		this.robotInfo = robotInfo;
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		Integer curDegree = robotInfo.getFacing().getDegree();
		if (curDegree!=null){
			curDegree = curDegree - 45;
			curDegree = Utils.fixDegree(curDegree);
			robotInfo.setFacing(Facing.valueOfDegree(curDegree));
		}
	}

}
