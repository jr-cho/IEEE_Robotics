package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private final DcMotor intakeMotor;

    // Power levels (can be adjusted later or moved to constants)
    private static final double HIGH_POWER = -0.8;
    private static final double LOW_POWER = -0.2;

    private static final double STOP_POWER = 0.0;

    public Intake(HardwareMap hardwareMap) {
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
        intakeMotor.setPower(STOP_POWER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void start() {
        intakeMotor.setPower(HIGH_POWER);

    }
    public void stop() {
        intakeMotor.setPower(STOP_POWER);
    }

    public void setPower(double power) {
        intakeMotor.setPower(power);
    }
}
