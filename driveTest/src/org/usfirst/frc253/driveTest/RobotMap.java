// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.driveTest;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.Spark;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static TalonSRX driveTrainLeftFront;
    public static TalonSRX driveTrainLeftBack;
    public static TalonSRX driveTrainRightFront;
    public static TalonSRX driveTrainRightBack;
    
    public static DigitalInput sensorsLimitSwitch;
    public static Spark sparkLeft;
    public static Spark sparkRight;
    public static AHRS ahrs;
    
    public static Compressor pneumaticsCompressor1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid2;
    public static DoubleSolenoid pneumaticsDoubleSolenoid3;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new TalonSRX(1);
        
        driveTrainLeftBack = new TalonSRX(2);
        
        driveTrainRightFront = new TalonSRX(3);
        
        driveTrainRightBack = new TalonSRX(4);
        
        sensorsLimitSwitch = new DigitalInput(0);
        ahrs = new AHRS(I2C.Port.kMXP);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        sparkLeft = new Spark(3);
        sparkRight = new Spark(4);
        /*Remember to confirm that the spark number correctly correlates
    	to the right side.*/
        pneumaticsCompressor1 = new Compressor(0);
        
        pneumaticsDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        pneumaticsDoubleSolenoid2 = new DoubleSolenoid(0, 2, 3);
        pneumaticsDoubleSolenoid3 = new DoubleSolenoid(0, 4, 5);
        
    }
}