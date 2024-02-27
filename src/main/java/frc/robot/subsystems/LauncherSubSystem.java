// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherSubSystem extends SubsystemBase {
  /** Creates a new LauncherSubSystem. */
  PWMSparkMax Launchermotors;
  public LauncherSubSystem() {
    launchermotors = new PWMSparkMax(Constants.LAUNCHERPORT);
  }
  public void setlaunchmotors(double power){
    launchermotors.set(power);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
