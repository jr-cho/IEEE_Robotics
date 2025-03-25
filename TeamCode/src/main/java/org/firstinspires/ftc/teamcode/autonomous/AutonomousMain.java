package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.DriveTrain;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.BeaconArm;


@Autonomous(name = "drive test", group = "Autonomous")
public class AutonomousMain extends LinearOpMode {

    @Override
    public void runOpMode() {
        // Initialize subsystems
        DriveTrain driveTrain = new DriveTrain(hardwareMap);
        BeaconArm beaconArm = new BeaconArm(hardwareMap);
        Intake intake = new Intake(hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();

        if (opModeIsActive()) {
            telemetry.addData("Status", "Moving forward");
            telemetry.update();

            while(true){
                intake.start();
                driveTrain.driveStraight(-0.6, 1000);
                driveTrain.strafeRight(-0.6, 250);
            }



        }
    }
}