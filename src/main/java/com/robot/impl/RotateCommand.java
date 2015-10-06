package com.robot.impl;

import com.robot.Command;
import com.robot.IRotate;
import com.robot.RobotInfo;
import com.robot.RotateFactory;

public class RotateCommand extends AbstractCommand {

	public RotateCommand(Command command, RobotInfo robotInfo) {
		super(command, robotInfo);
	}

	@Override
	public void executeAction() {
		IRotate rotate = null;
		rotate = RotateFactory.getInstance(command, robotInfo);
		if (rotate != null) {
			rotate.rotate();
		}

	}

}
