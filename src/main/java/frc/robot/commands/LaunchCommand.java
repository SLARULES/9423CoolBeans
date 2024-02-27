// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.LauncherSubSystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants;
public class LaunchCommand extends Command {
  /** Creates a new LaunchCommand. */
  LauncherSubSystem m_launcherSubsystem;
  XboxController m_xboxController;
  public LaunchCommand(LauncherSubSystem launcherSubSystem, XboxController xboxController ) {
    m_launcherSubsystem = launcherSubSystem;
    m_xboxController =xboxController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_launcherSubsystem);
  }

  // Called when the command is initially scheduled.

  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   double backwardvalue = -m_xboxController.getRawAxis(Constants.LEFT_TRIGGER);
   double forwardvalue = m_xboxController.getRawAxis(Constants.RIGHT_TRIGGER);
   m_driveTrainSub.setlaunchmotors(forwardvalue + backwardvalue);


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
