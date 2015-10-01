package com.robot;

import com.robot.impl.RotateLeft;
import com.robot.impl.RotateRight;

public class RotateFactory {

	public static IRotate getInstance(Command rotateDirection,RobotInfo robotInfo){
		
		IRotate rotate = null;
		switch(rotateDirection){
		case LEFT:
			rotate = new RotateLeft(robotInfo);
			break;
		case RIGHT:
			rotate = new RotateRight(robotInfo);
			break;
		}
		
		return rotate;
	}
}
