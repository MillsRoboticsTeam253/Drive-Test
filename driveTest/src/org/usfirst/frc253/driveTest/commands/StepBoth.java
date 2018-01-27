package org.usfirst.frc253.driveTest.commands;
import org.usfirst.frc253.driveTest.Robot;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class StepBoth extends CommandGroup{
	
	public StepBoth(double leftVelocity, double rightVelocity){
		addParallel(new StepLeft(leftVelocity));
		addSequential(new StepRight(rightVelocity));
	}
}
