package com.robot.impl;

import com.robot.Command;
import com.robot.ICommand;
import com.robot.RobotInfo;

public class ReportCommand implements ICommand {

	private RobotInfo robotInfo = null;
	@SuppressWarnings("unused")
	private Command command;

	public ReportCommand(Command command, RobotInfo robotInfo) {
		this.robotInfo = robotInfo;
		this.command = command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Output: %s", robotInfo));
	}

}
