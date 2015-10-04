package com.robot.impl;

import com.robot.Command;
import com.robot.ICommand;
import com.robot.RobotInfo;

public abstract class AbstractCommand implements ICommand {

	protected RobotInfo robotInfo;
	protected Command command;
	protected RobotInfo cloneRobotInfo;

	public AbstractCommand(Command command, RobotInfo robotInfo) {
		this.robotInfo = robotInfo;
		this.cloneRobotInfo = this.robotInfo.clone();
		this.command = command;
	}

	// do execute
	public abstract void executeAction();

	@Override
	public void execute() {
		this.executeAction();
		// if out of table ,undo the action
		if (isOutofTable(robotInfo)) {
			robotInfo.setX(cloneRobotInfo.getX());
			robotInfo.setY(cloneRobotInfo.getY());
			robotInfo.setFacing(cloneRobotInfo.getFacing());
		}
		System.out
				.println(String
						.format("log debug: execute command : [%s] finished,robot current info : [%s,%s,%s]",
								this.command, robotInfo.getX(),
								robotInfo.getY(), robotInfo.getFacing()));
	}

	/**
	 * validate robotInfo ,it should not out of the table
	 * 
	 * @param command
	 */
	protected boolean isOutofTable(RobotInfo robotInfo) {
		if (robotInfo.getX() < 0 || robotInfo.getX() > robotInfo.getMaxUnits()) {
			return true;
		}
		if (robotInfo.getY() < 0 || robotInfo.getY() > robotInfo.getMaxUnits()) {
			return true;
		}
		return false;
	}

}