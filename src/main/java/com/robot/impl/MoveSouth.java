package com.robot.impl;

import com.robot.IMove;
import com.robot.RobotInfo;

public class MoveSouth implements IMove {

	private RobotInfo robotInfo;

	public MoveSouth(RobotInfo robotInfo) {
		this.robotInfo = robotInfo;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		robotInfo.setY(robotInfo.getY() - 1);
	}

}
