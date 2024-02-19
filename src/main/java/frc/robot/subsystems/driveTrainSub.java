// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
public class driveTrainSub extends SubsystemBase {
  /** Creates a new driveTrainSub. */
  PWMSparkMax leftSide;
  PWMSparkMax rightSide;
  public driveTrainSub() {
    leftSide = new PWMSparkMax(1);
    rightSide = new PWMSparkMax(2);
  }
  public void moveLeftSide(double power){
    leftSide.set(-power);
  }
  public void moveRightSide(double power){
    rightSide.set(power);
  }
  public void arcadeDrive(double forwardPower, double turnPower){
      moveLeftSide(forwardPower + turnPower);
      moveRightSide(forwardPower - turnPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
