package org.usfirst.frc253.driveTest.commands;

import org.usfirst.frc253.driveTest.Robot;

import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PIDParallel extends PIDCommand {
	
	public PIDParallel(){
		super(100, 0, 0);
		setTimeout(5);
		getPIDController().setSetpoint(1);
	}

	@Override
	protected double returnPIDInput() {
		double left = -Robot.driveTrain.getTalonLeft().getSelectedSensorVelocity(0)/4096 * (6*Math.PI)/12;
		double right = Robot.driveTrain.getTalonRight().getSelectedSensorVelocity(0)/4096 * (6*Math.PI)/12;
		
		return left/right;
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		
	}
	
	protected void execute(){
		SmartDashboard.putNumber("PIDRatio Output", getPIDController().get());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
