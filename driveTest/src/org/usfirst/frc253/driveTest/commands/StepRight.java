package org.usfirst.frc253.driveTest.commands;
import org.usfirst.frc253.driveTest.Robot;
import org.usfirst.frc253.driveTest.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StepRight extends PIDCommand {

	private double rightVelocity;
	
	boolean toggle = true;
	
    public StepRight(double right) {
    	super(RobotMap.stepkP, 0, RobotMap.stepkD);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.rightVelocity = right;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(0.1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(toggle){
    		getPIDController().setSetpoint(rightVelocity);
    	}
    	Robot.driveTrain.driveRight(rightVelocity - (getPIDController().get()/4096.0*RobotMap.wheelCFeet*100));
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
		return Robot.driveTrain.getTalonRight().getSelectedSensorVelocity(0);
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		SmartDashboard.putNumber("StepRight PIDOutput", output);
	}
}

