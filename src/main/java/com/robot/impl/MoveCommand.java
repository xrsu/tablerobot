package com.robot.impl;

import com.robot.Command;
import com.robot.IMove;
import com.robot.MoveFactory;
import com.robot.RobotInfo;

public class MoveCommand extends AbstractCommand {

	public MoveCommand(Command command, RobotInfo robotInfo) {
		super(command, robotInfo);
	}

	@Override
	public void executeAction() {
		// TODO Auto-generated method stub
		IMove move = MoveFactory.getInstance(robotInfo);
		if (move != null) {
			move.move();
		}
	}

}
