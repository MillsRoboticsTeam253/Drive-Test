package org.usfirst.frc253.driveTest.commands;

import org.usfirst.frc253.driveTest.Robot;
import org.usfirst.frc253.driveTest.profiles.ProfileLib;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.TrajectoryPoint;

import edu.wpi.first.wpilibj.command.Command;

public class RunPath extends Command{
	
	boolean toggle = true;
	
	public RunPath(){
		requires(Robot.driveTrain);
		
	}
	
	protected void execute(){
		if(toggle){
			MotionProfileStatus statusLeft = new MotionProfileStatus();
			MotionProfileStatus statusRight = new MotionProfileStatus();
			
			Robot.driveTrain.getTalonLeft().getMotionProfileStatus(statusLeft);
			Robot.driveTrain.getTalonRight().getMotionProfileStatus(statusRight);
			
			if(statusLeft.hasUnderrun){
				Robot.driveTrain.getTalonLeft().clearMotionProfileHasUnderrun(0);
				 
			}
			if(statusRight.hasUnderrun){
				Robot.driveTrain.getTalonRight().clearMotionProfileHasUnderrun(0);
			}
			
			Robot.driveTrain.getTalonLeft().clearMotionProfileTrajectories();
			Robot.driveTrain.getTalonRight().clearMotionProfileTrajectories();
			
			for(TrajectoryPoint point : ProfileLib.StraightTenFeetLeft.getPoints()){
				Robot.driveTrain.getTalonLeft().pushMotionProfileTrajectory(point);
			}
			for(TrajectoryPoint point : ProfileLib.StraightTenFeetRight.getPoints()){
				Robot.driveTrain.getTalonRight().pushMotionProfileTrajectory(point);
			}
			toggle = false;
		}
		Robot.driveTrain.getTalonLeft().processMotionProfileBuffer();
		Robot.driveTrain.getTalonRight().processMotionProfileBuffer();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
