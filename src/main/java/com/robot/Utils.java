package com.robot;

import java.util.regex.Pattern;

public class Utils {

	public static Integer fixDegree(Integer degree){
		if(degree>=360){
			degree = degree - 360;
		}else if(degree<0){
			degree = degree + 360;
		}
		return degree;
	}
	
	public static boolean isNumeric(String str){ 
		Pattern pattern = Pattern.compile("[0-9]*"); 
		return pattern.matcher(str).matches(); 
	} 
	
	/**
	 * 
	 * @param command
	 * @return
	 */
	public static Boolean validateCommand(Command command,boolean isPlaced){
		if(!isPlaced && command!=Command.PLACE){
			System.out.println(String.format("Ignore the command %s", command));
			return false;
		}else
			return true;
	}
}
