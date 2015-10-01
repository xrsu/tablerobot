package com.robot.impl;

import com.robot.Command;
import com.robot.ICommand;

public abstract class AbstractCommand implements ICommand {

	@Override
	public abstract void execute();
	
	/**
	 * validate command is in command list
	 * @param command
	 */
	public void validateCommand(Command command){
		
	}

}
