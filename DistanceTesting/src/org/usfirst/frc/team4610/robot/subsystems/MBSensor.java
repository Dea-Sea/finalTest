package org.usfirst.frc.team4610.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4610.robot.Robot;
import org.usfirst.frc.team4610.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MBSensor extends Subsystem 
{

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private AnalogInput ez0;
	
	public MBSensor(int port) 
	{
		ez0 = new AnalogInput(port);
	}
	
	public double showReading()
	{
		return this.ez0.getVoltage();
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

