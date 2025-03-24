package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {

    // Motors
    public DcMotor leftFront;
    public DcMotor rightFront;
    public DcMotor leftBack;
    public DcMotor rightBack;
    public DcMotor intakeMotor;

    // Servos
    public Servo beaconArm;
    public Servo boxGrabberRight;
    public Servo boxGrabberLeft;
    public Servo boxDumperRight;
    public Servo boxDumperLeft;
    public Servo clawRight;
    public Servo clawLeft;

    // Initialization method
    public void init(HardwareMap hwMap) {
        // Initialize drive motors
        leftFront = hwMap.get(DcMotor.class, "leftFront");
        rightFront = hwMap.get(DcMotor.class, "rightFront");
        leftBack = hwMap.get(DcMotor.class, "leftBack");
        rightBack = hwMap.get(DcMotor.class, "rightBack");
        intakeMotor = hwMap.get(DcMotor.class, "intakeMotor");

        // Set motor directions (adjust as needed)
        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);
        intakeMotor.setDirection(DcMotor.Direction.FORWARD);

        // Stop all motors initially
        leftFront.setPower(0);
        rightFront.setPower(0);
        leftBack.setPower(0);
        rightBack.setPower(0);
        intakeMotor.setPower(0);

        // Set motors to run without encoders for now
        leftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Initialize servos
        beaconArm = hwMap.get(Servo.class, "beaconArm");
//        boxGrabberRight = hwMap.get(Servo.class, "boxGrabberRight");
//        boxGrabberLeft = hwMap.get(Servo.class, "boxGrabberLeft");
//        boxDumperRight = hwMap.get(Servo.class, "boxDumperRight");
//        boxDumperLeft = hwMap.get(Servo.class, "boxDumperLeft");
//        clawRight = hwMap.get(Servo.class, "clawRight");
//        clawLeft = hwMap.get(Servo.class, "clawLeft");

    }
}
