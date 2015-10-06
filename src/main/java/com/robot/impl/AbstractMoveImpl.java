package com.robot.impl;

import com.robot.IMove;
import com.robot.RobotInfo;

public abstract class AbstractMoveImpl implements IMove {

	public abstract RobotInfo move(RobotInfo robotInfo);

}
