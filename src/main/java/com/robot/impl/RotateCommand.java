package com.robot.impl;

import com.robot.Command;
import com.robot.ICommand;
import com.robot.IRotate;
import com.robot.RobotInfo;
import com.robot.RotateFactory;

public class RotateCommand implements ICommand {
	
private RobotInfo robotInfo = null;
private Command command;
	
	public RotateCommand(Command command,RobotInfo robotInfo){
		this.robotInfo = robotInfo;
		this.command = command;
	}

	@Override
	public void execute() {
		
		IRotate rotate = null;
		rotate = RotateFactory.getInstance(command, robotInfo);
		if(rotate!=null){
			rotate.rotate();
		}
		
	}

}
