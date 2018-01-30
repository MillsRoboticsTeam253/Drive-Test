package org.usfirst.frc253.driveTest.commands;
import org.usfirst.frc253.driveTest.Robot;
import org.usfirst.frc253.driveTest.*;
import org.usfirst.frc253.driveTest.subsystems.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Solenoid3Reverse extends Command{
		
	public Solenoid3Reverse(){
		requires(Robot.pneumatics);
	}
		
	
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.pneumatics.Solenoid3Reverse();
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
    	Robot.pneumatics.Solenoid3Off();
    }
}


