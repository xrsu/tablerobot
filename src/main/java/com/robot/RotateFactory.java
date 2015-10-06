package com.robot;

import com.robot.impl.RotateLeft;
import com.robot.impl.RotateLeftD;
import com.robot.impl.RotateRight;
import com.robot.impl.RotateRightD;

public class RotateFactory {

	@SuppressWarnings("incomplete-switch")
	public static IRotate getInstance(Command rotateDirection,RobotInfo robotInfo){
		
		IRotate rotate = null;
		switch(rotateDirection){
		case LEFT:
			rotate = new RotateLeft(robotInfo);
			break;
		case RIGHT:
			rotate = new RotateRight(robotInfo);
			break;
		case LEFTD:
			rotate = new RotateLeftD(robotInfo);
			break;
		case RIGHTD:
			rotate = new RotateRightD(robotInfo);
			break;
		}
		
		return rotate;
	}
}
