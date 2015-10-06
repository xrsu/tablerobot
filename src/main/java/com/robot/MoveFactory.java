package com.robot;

import com.robot.impl.MoveEast;
import com.robot.impl.MoveNorth;
import com.robot.impl.MoveNorthEast;
import com.robot.impl.MoveNorthWest;
import com.robot.impl.MoveSouth;
import com.robot.impl.MoveSouthEast;
import com.robot.impl.MoveSouthWest;
import com.robot.impl.MoveWest;

public class MoveFactory {

	public static IMove getInstance(RobotInfo robotInfo){		
		IMove move = null;
		switch(robotInfo.getFacing()){
		case WEST:
				move = new MoveWest(robotInfo);
			break;
		case EAST:
				move = new MoveEast(robotInfo);
				break;
		case NORTH:
				move = new MoveNorth(robotInfo);
				break;
		case SOUTH:
				move = new MoveSouth(robotInfo);
				break;
				//expand in part2
		case NORTHEAST:
			move = new MoveNorthEast(robotInfo);
			break;
		case NORTHWEST:
			move = new MoveNorthWest(robotInfo);
			break;
		case SOUTHEAST:
			move = new MoveSouthEast(robotInfo);
			break;
		case SOUTHWEST:
			move = new MoveSouthWest(robotInfo);
			break;
				
		}
		return move;
	}
}
