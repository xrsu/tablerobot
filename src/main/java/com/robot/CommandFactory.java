package com.robot;

import com.robot.impl.MoveCommand;
import com.robot.impl.PlaceCommand;
import com.robot.impl.ReportCommand;
import com.robot.impl.RotateCommand;

public class CommandFactory {
	
	public static ICommand getInstance(Command command, String commandParams, RobotInfo robotInfo){
		ICommand commandInst = null;
		/*
		 * Have to run the PLACE command before other commands, otherwise ignore the commands. 
		 */
		if(!Utils.validateCommand(command,robotInfo.isPlaced()))
		{
			return null;
		}
			
		switch(command){
		case LEFT:
		case RIGHT:
		case LEFTD:
		case RIGHTD:
			commandInst = new RotateCommand(command, robotInfo);
			break;
		case MOVE:
			
			
			commandInst = new MoveCommand(command,robotInfo);
			break;
		case PLACE:
			commandInst = new PlaceCommand(command, commandParams, robotInfo);
			break;
		case REPORT:
			commandInst = new ReportCommand(command, robotInfo);
			break;
		}
		return commandInst;
	}

}
