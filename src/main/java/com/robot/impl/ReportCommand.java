package com.robot.impl;

import com.robot.Command;
import com.robot.RobotInfo;

public class ReportCommand extends AbstractCommand {

	public ReportCommand(Command command, RobotInfo robotInfo) {
		super(command, robotInfo);
	}

	@Override
	public void executeAction() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Output: %s", robotInfo));
	}

}
