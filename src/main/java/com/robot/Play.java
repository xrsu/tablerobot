package com.robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Play {
	
	private RobotInfo robotInfo = null;
	
	/*@SuppressWarnings("unused")
	private int table[][] = new  int[Constants.MAX_UNITS][Constants.MAX_UNITS];*/
	
	public Play(){
		robotInfo = new RobotInfo();
		robotInfo.setX(0);
		robotInfo.setY(0);
		robotInfo.setMaxUnits(Constants.MAX_UNITS);
	}
	
	public void executeCommand(String command){
		CommandObj commandObj = parseValidateCommand(command);
		
		ICommand commandInst = CommandFactory.getInstance(commandObj.getCommand(), commandObj.getCommandParams(), robotInfo);
		if(commandInst!=null){
			commandInst.execute();
		}
	}

	private CommandObj parseValidateCommand(String commandLine){
		String commandArray[] = commandLine.split(" ");
		
		//Exception if invalid command
		Command command = Command.valueOf(commandArray[0]);
		String commandParams = null; 
		
		/*
		 * PLACE has params
		 * 
		 * Exception if no params for PLACE 
		 */
		if(command == Command.PLACE){
			commandParams = commandArray[1];
		}
		
		return new CommandObj(command, commandParams);
	}
	public static void main(String args[]){
		Play play = new Play();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				play.executeCommand(br.readLine());
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public RobotInfo getRobotInfo() {
		return robotInfo;
	}

	class CommandObj{
		private Command command;
		private String commandParams;
		public CommandObj(Command command, String commandParams) {
			super();
			this.command = command;
			this.commandParams = commandParams;
		}
		public Command getCommand() {
			return command;
		}
		public String getCommandParams() {
			return commandParams;
		}
		
	}
}
