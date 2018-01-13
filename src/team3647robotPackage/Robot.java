package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot 
{
	Joysticks joyStickObject;
	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	public void robotInit() 
	{
		joyStickObject = new Joysticks();
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{
		
	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{
		
	}
	
	double SpecialValue1 = .5;
	double SpecialValue2 = -.5;
	
	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		joyStickObject.updateMainController();
		if(Joysticks.buttonA)
		{
			SpecialValue1 = SpecialValue1 * -1;
			SpecialValue2 = SpecialValue2 * -1;
			Motors.leftMotor.set(SpecialValue1);
			Motors.rightMotor.set(SpecialValue2);
		}
		else 
		{
			Motors.leftMotor.set(SpecialValue1);
			Motors.rightMotor.set(SpecialValue2);
		}
	
		
	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

