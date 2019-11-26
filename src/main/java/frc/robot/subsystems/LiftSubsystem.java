

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class LiftSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(Robot.liftExCommand);
  }

  public void operate(double val) {
    if ((RobotMap.liftLimit.get() && val > 0)) {
      val = 0;
    }
    RobotMap.lift.set(ControlMode.PercentOutput, val);
  }
}

