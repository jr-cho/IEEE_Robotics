package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveTrain {

    private final DcMotor leftFront;
    private final DcMotor rightFront;
    private final DcMotor leftBack;
    private final DcMotor rightBack;

    public DriveTrain(HardwareMap hardwareMap) {
        this.leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        this.rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        this.leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        this.rightBack = hardwareMap.get(DcMotor.class, "rightBack");

        // Motor directions (adjust if needed)
        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);

        // Initial state
        stop();

        // No encoders for now
        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    // Move forward/backward
    public void drive(double power) {
        leftFront.setPower(power);
        rightFront.setPower(power);
        leftBack.setPower(power);
        rightBack.setPower(power);
    }

    // Strafe left/right (positive = right, negative = left)
    public void strafe(double power) {
        leftFront.setPower(-power);
        rightFront.setPower(power);
        leftBack.setPower(power);
        rightBack.setPower(-power);
    }

    // Rotate in place (positive = clockwise)
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

    // Fine-tuned control
    public void rawDrive(double lf, double rf, double lb, double rb) {
        leftFront.setPower(lf);
        rightFront.setPower(rf);
        leftBack.setPower(lb);
        rightBack.setPower(rb);
    }

    // ==== Timed Movement Modules ====

    public void driveStraight(double power, long durationMs) {
        drive(power);
        sleep(durationMs);
        stop();
    }

    public void strafeRight(double power, long durationMs) {
        strafe(power);
        sleep(durationMs);
        stop();
    }

    public void strafeLeft(double power, long durationMs) {
        strafe(-power);
        sleep(durationMs);
        stop();
    }

    public void rotate360(double power) {
        // Tune the time to match a full 360° rotation
        rotate(power);
        sleep(1500); // ← Adjust as needed based on testing
        stop();
    }

    // Internal helper
    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
