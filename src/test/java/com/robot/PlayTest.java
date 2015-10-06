package com.robot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.robot.Play;

public class PlayTest {
	
	private Play play;
	@Before
	public void startUp(){
		play = new Play();
	}
	@Test
	public void testCase1(){
		System.out.println("start testCase 1: PLACE 0,0,NORTH \r\n");
		
		String expected = "0, 1, NORTH";
		
		play.executeCommand("PLACE 0,0,NORTH");
		play.executeCommand("MOVE");
		play.executeCommand("REPORT");
		
		Assert.assertEquals(expected, play.getRobotInfo().toString());
	}
	@Test
	public void testCase2(){
		System.out.println("start testCase 2: PLACE 0,0,NORTH \r\n");
		String expected = "0, 0, WEST";
		play.executeCommand("PLACE 0,0,NORTH");
		play.executeCommand("LEFT");
		play.executeCommand("REPORT");
		Assert.assertEquals(expected, play.getRobotInfo().toString());
	}
	@Test
	public void testCase3(){
		System.out.println("start testCase 3: PLACE 1,2,EAST \r\n");
		String expected = "3, 3, NORTH";
		play.executeCommand("PLACE 1,2,EAST");
		play.executeCommand("MOVE");
		play.executeCommand("MOVE");
		play.executeCommand("LEFT");
		play.executeCommand("MOVE");
		play.executeCommand("REPORT");
		Assert.assertEquals(expected, play.getRobotInfo().toString());
	}
	
	@Test
	public void testCase4(){
		System.out.println("start testCase 4: PLACE 0,0,SOUTH \r\n");
		String expected = "0, 0, SOUTH";
		play.executeCommand("PLACE 0,0,SOUTH");
		play.executeCommand("MOVE");
		play.executeCommand("MOVE");
		play.executeCommand("REPORT");
		Assert.assertEquals(expected, play.getRobotInfo().toString());
	}
	
	@Test
	public void testCase5(){
		System.out.println("start testCase 1: PLACE 1,2,EAST \r\n");
		
		String expected = "3, 5, NORTH";
		
		play.executeCommand("PLACE 1,2,EAST");
		play.executeCommand("MOVE");
		play.executeCommand("MOVE");
		play.executeCommand("LEFTD");
		play.executeCommand("MOVE");
		play.executeCommand("LEFT");
		play.executeCommand("MOVE");
		play.executeCommand("RIGHTD");
		play.executeCommand("MOVE");
		play.executeCommand("REPORT");
		
		Assert.assertEquals(expected, play.getRobotInfo().toString());
	}
}
