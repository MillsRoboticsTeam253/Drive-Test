// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.driveTest.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.GenericHID;
import org.usfirst.frc253.driveTest.Robot;

/**
 *
 */
public class TankDrive extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TankDrive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double left;
    	double right;
    	if(Math.abs(Robot.oi.getLeftJoystickY())<=0.125){
    		left = -Robot.oi.getRightJoystickX();
    		right = Robot.oi.getRightJoystickX();
    	}else{
		    left = Robot.oi.getLeftJoystickY()+Robot.oi.getLeftJoystickY()*Robot.oi.getRightJoystickX();//.getY();
		    right = Robot.oi.getLeftJoystickY()-Robot.oi.getLeftJoystickY()*Robot.oi.getRightJoystickX();//.getY();
    	}
    	
    	Robot.driveTrain.drive(left, right);
    	SmartDashboard.putNumber("Left Joystick", left);
    	SmartDashboard.putNumber("Right Joystick", right);
    	
    	
    	double leftSpeed = Robot.driveTrain.getTalonLeft().getSelectedSensorVelocity(0);
    	double rightSpeed = Robot.driveTrain.getTalonRight().getSelectedSensorVelocity(0);
    	
    	SmartDashboard.putNumber("Left Speed", leftSpeed);
    	SmartDashboard.putNumber("Right Speed", rightSpeed);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}