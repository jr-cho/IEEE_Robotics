package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.hardware.RobotHardware;
import org.firstinspires.ftc.teamcode.hardware.HardwareConstants;

public class DriveTrain {

    private final DcMotor leftFront;
    private final DcMotor rightFront;
    private final DcMotor leftBack;
    private final DcMotor rightBack;

    public DriveTrain(RobotHardware hardware) {
        this.leftFront = hardware.leftFront;
        this.rightFront = hardware.rightFront;
        this.leftBack = hardware.leftBack;
        this.rightBack = hardware.rightBack;
    }

    // Move forward/backward
    public void drive(double power) {
        leftFront.setPower(power);
        rightFront.setPower(power);
        leftBack.setPower(power);
        rightBack.setPower(power);
    }

    // Strafe left/right
    public void strafe(double power) {
        leftFront.setPower(-power);
        rightFront.setPower(power);
        leftBack.setPower(power);
        rightBack.setPower(-power);
    }

    // Rotate left/right
    public void rotate(double power) {
        leftFront.setPower(-power);
        rightFront.setPower(power);
        leftBack.setPower(-power);
        rightBack.setPower(power);
    }

    // Stop all drive motors
    public void stop() {
        drive(0);
    }

    // Drive with custom powers (DONT TOUCH UNLESS YOU NEED FINE TUNED CONTROL)
    public void rawDrive(double lf, double rf, double lb, double rb) {
        leftFront.setPower(lf);
        rightFront.setPower(rf);
        leftBack.setPower(lb);
        rightBack.setPower(rb);
    }
}
