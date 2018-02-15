package org.usfirst.frc253.driveTest.profiles;

import java.util.ArrayList;

public class ProfileLib {	
	public static ArrayList<MotionProfileData> straightTenFeet = new ArrayList<MotionProfileData>() {{
		add(new MotionProfileData("StraightTenFeet_left.csv", false, false, false));
		add(new MotionProfileData("StraightTenFeet_right.csv", false, false, false));
	}};
	
	public static ArrayList<MotionProfileData> rightToSwitch = new ArrayList<MotionProfileData>() {{
		add(new MotionProfileData("RightToSwitch_left.csv", false, false, false));
		add(new MotionProfileData("RightToSwitch_right.csv", false, false, false));
	}};
	
	public static ArrayList<MotionProfileData> middletoSwitchR = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("MiddletoSwitchR_left.csv", false, false, false));
		add(new MotionProfileData("MiddletoSwitchR_right.csv", false, false,false));
	}};
	public static ArrayList<MotionProfileData> testrighttoswitch = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("testrighttoswitch_left.csv", false, false, false));
		add(new MotionProfileData("testrighttoswitch_right.csv", false, false,false));
	}};
	public static ArrayList<MotionProfileData> newerRightToSwitch = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("NewerRightToSwitch_left.csv", false, false, false));
		add(new MotionProfileData("NewerRightToSwitch_right.csv", false, false, false));
	}};
	public static ArrayList<MotionProfileData> newererRightToSwitch = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("newererRightToSwitch_left.csv", false, false, false));
		add(new MotionProfileData("newererRightToSwitch_right.csv", false, false, false));
	}};
	public static ArrayList<MotionProfileData> UDriveRtoRSwitch = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("U-DriveRightToRightSwitch_left.csv", false, false, false));
		add(new MotionProfileData("U-DriveRightToRightSwitch_right.csv", false, false, false));
	}};
	public static ArrayList<MotionProfileData> UDriveRRSnew = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("UDriveRRSnew_left.csv", false, false, false));
		add(new MotionProfileData("UDriveRRSnew_right.csv", false, false, false));
	}};
	public static ArrayList<MotionProfileData> CDriveRtoRS = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("CDriveRightToSwitch_left.csv", false, false, false));
		add(new MotionProfileData("CDriveRightToSwitch_right.csv", false, false, false));
	}};
	public static ArrayList<MotionProfileData> CDriveRtoRScent = new ArrayList<MotionProfileData>(){{
		add(new MotionProfileData("CDriveRightToSwitchCent_left.csv", false, false, false));
		add(new MotionProfileData("CDriveRightToSwitchCent_right.csv", false, false, false));
	}};
} 
