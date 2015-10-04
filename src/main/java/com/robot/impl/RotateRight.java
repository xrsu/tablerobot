package com.robot.impl;

import com.robot.Facing;
import com.robot.IRotate;
import com.robot.RobotInfo;
import com.robot.Utils;

public class RotateRight implements IRotate {

	private RobotInfo robotInfo;

	public RotateRight(RobotInfo robotInfo) {
		this.robotInfo = robotInfo;
	}

	@Override
	public void rotate() {

		Integer curDegree = robotInfo.getFacing().getDegree();

		curDegree = curDegree - 90;
		curDegree = Utils.fixDegree(curDegree);
		robotInfo.setFacing(Facing.valueOfDegree(curDegree));

	}

}
