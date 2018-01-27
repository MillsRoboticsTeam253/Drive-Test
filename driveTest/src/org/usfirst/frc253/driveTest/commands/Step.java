package org.usfirst.frc253.driveTest.commands;
import org.usfirst.frc253.driveTest.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Step extends PIDCommand {

	private final double leftVelocity;
	private final double rightVelocity;
	
    public Step(double left, double right) {
    	super(0.1, 0, 0);
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
    	getPIDController().setSetpoint(leftVelocity/rightVelocity);
    	double ratio = getPIDController().get(); //left over right
    	Robot.driveTrain.drive(leftVelocity + (ratio * rightVelocity) , rightVelocity + (leftVelocity / ratio));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return Robot.driveTrain.getTalonLeft().getSelectedSensorVelocity(0)/Robot.driveTrain.getTalonRight().getSelectedSensorVelocity(0);
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		SmartDashboard.putNumber("PIDRatio Output", output);
	}
}

