package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class BeaconArm {
    private final Servo beaconServo;

    // Position values (in degrees)
    private static final double REST_ANGLE = 0.0;
    private static final double PRIME_ANGLE = 90.0;
    private static final double PLACE_ANGLE = 150.0;

    public BeaconArm(HardwareMap hardwareMap) {
        beaconServo = hardwareMap.get(Servo.class, "beaconArm");
    }

    public void moveToAngle(double angle) {
        angle = Math.max(0, Math.min(angle, 180));
        double position = angle / 180.0;
        beaconServo.setPosition(position);
    }

    public void rest() {
        moveToAngle(REST_ANGLE);
    }

    public void prime() {
        moveToAngle(PRIME_ANGLE);
    }

    public void place() {
        moveToAngle(PLACE_ANGLE);
    }
}
