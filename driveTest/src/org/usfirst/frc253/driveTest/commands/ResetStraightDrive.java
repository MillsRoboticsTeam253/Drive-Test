package org.usfirst.frc253.driveTest.commands;
import org.usfirst.frc253.driveTest.*;
import org.usfirst.frc253.driveTest.commands.StraightDrive;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc253.driveTest.subsystems.*;
import org.usfirst.frc253.driveTest.OI;
public class ResetStraightDrive extends Command {
	
	public ResetStraightDrive(){
		requires(Robot.driveTrain);
	}
	
	protected void execute() {
		Robot.driveTrain.getTalonLeft().setSelectedSensorPosition(0, 0, 0);
		Robot.driveTrain.getTalonRight().setSelectedSensorPosition(0, 0, 0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}	

}
