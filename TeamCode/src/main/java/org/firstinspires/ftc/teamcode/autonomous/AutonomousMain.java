package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.subsystems.BeaconArm;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrain;

@Autonomous(name = "main", group = "Autonomous")
public class AutonomousMain extends LinearOpMode {

    @Override
    public void runOpMode() {
        // Initialize subsystems
        DriveTrain driveTrain = new DriveTrain(hardwareMap);
        BeaconArm beaconArm = new BeaconArm(hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();

        if (opModeIsActive()) {
            telemetry.addData("Status", "Robot is now moivng!");
            telemetry.update();
            driveTrain.drive(1);
            
        }
    }
}