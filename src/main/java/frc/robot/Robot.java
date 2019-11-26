/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.commands.LiftCommand;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.*;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {



  public static LiftSubsystem liftExSubsystem;
  public static LiftCommand liftExCommand;

  @Override
  public void robotInit() {
    RobotMap.init();
    OI.init();
   LiftSubsystem ls = new LiftSubsystem();

    LiftCommand lc = new LiftCommand();

  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
}

