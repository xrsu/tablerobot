/**
 * init a new robot info
 */


package com.robot.impl;

import com.robot.Command;
import com.robot.Facing;
import com.robot.RobotInfo;
import com.robot.Utils;

public class PlaceCommand extends AbstractCommand {
	
	private RobotInfo robotInfo;
	@SuppressWarnings("unused")
	private Command command;
	private String initParams;
	
	public PlaceCommand(Command command,RobotInfo robotInfo){
		super(command,robotInfo);
	}
		
		public PlaceCommand(Command command, String initParams, RobotInfo robotInfo){
			super(command,robotInfo);
			this.robotInfo = robotInfo;
			this.command = command;
			this.initParams = initParams;
		}

	@Override
	public void executeAction() {
		
		String initParamArray[] = initParams.split(",");
		if(validateParams(initParamArray)){
			robotInfo.setRobotInfo(initParamArray);
			//set placed
			robotInfo.setPlaced(true);
		}
		
	}
	
	private boolean validateParams(String[] initParamArray){
		//validate the first param
		if(initParamArray.length !=3){
			printErrorInfo("Sorry,robot needs 3 parameters, x,y,facing");
			return  false;
		}
		String xStr = initParamArray[0];
		if(!validateUnitParam(xStr)){
			return false;
		}
		String yStr = initParamArray[1];
		if(!validateUnitParam(yStr)){
			return false;
		}
		//validate facing
		String facing = initParamArray[2];
		if(!validateFacingParam(facing)){
			return false;
		}
		return true;
	}
	
	private boolean validateUnitParam(String unit){
		if(Utils.isNumeric(unit)){
			int x = Integer.parseInt(unit);
			if(x <= robotInfo.getMaxUnits()){
				return true;
			}
			else{
				printErrorInfo("Sorry,unit not allowed to greater then MAX_UNITS");
				return  false;
			}
		}
		else{
			printErrorInfo("Sorry,unit must be integer!");
			return  false;
		}
	}
	
	private boolean validateFacingParam(String facing){
		try{
			Facing.valueOf(facing);
			return true;
		}catch(IllegalArgumentException e){
			e.printStackTrace();
			return false;
		}
	}
	
	//if want to output to File instead of System.out.print,can expand this method
	private void printErrorInfo(String errorInfo){
		System.out.println(errorInfo + "\r\n");
	}

}
