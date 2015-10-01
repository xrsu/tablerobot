package com.robot.impl;

import com.robot.Command;
import com.robot.ICommand;
import com.robot.IMove;
import com.robot.MoveFactory;
import com.robot.RobotInfo;

public class MoveCommand implements ICommand {
	
	private RobotInfo robotInfo = null;
	@SuppressWarnings("unused")
	private Command command = null;
	
	public MoveCommand(Command command,RobotInfo robotInfo){
		this.robotInfo = robotInfo;
		this.command = command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		IMove move = MoveFactory.getInstance(robotInfo);
		if(move!=null){
			move.move();
		}
	}

}
