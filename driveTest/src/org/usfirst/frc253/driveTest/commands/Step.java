package org.usfirst.frc253.driveTest.commands;
import org.usfirst.frc253.driveTest.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Step extends Command {

	private double leftVelocity;
	private double rightVelocity;
	
    public Step(double left, double right) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	this.leftVelocity = left;
    	this.rightVelocity = right;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(0.1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.drive(leftVelocity, rightVelocity);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveTrain.drive(0, 0);
    }
}

