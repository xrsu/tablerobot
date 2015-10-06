package com.robot.impl;

import com.robot.IMove;
import com.robot.RobotInfo;

public class MoveSouthEast implements IMove {

	private RobotInfo robotInfo;

	public MoveSouthEast(RobotInfo robotInfo) {
		this.robotInfo = robotInfo;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		robotInfo.setX(robotInfo.getX() + 1);
		robotInfo.setY(robotInfo.getY() - 1);
	}

}
