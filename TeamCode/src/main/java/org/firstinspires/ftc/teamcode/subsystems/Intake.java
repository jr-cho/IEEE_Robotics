package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.hardware.RobotHardware;

public class Intake {

    private DcMotor intakeMotor;

    public Intake(RobotHardware hardware) {
        this.intakeMotor = hardware.intakeMotor;
    }

    public void start() {
        intakeMotor.setPower(1.0); // full power intake
    }

    public void reverse() {
        intakeMotor.setPower(-1.0); // reverse direction
    }

    public void stop() {
        intakeMotor.setPower(0.0);
    }

    public void setPower(double power) {
        intakeMotor.setPower(power); // custom power control if needed
    }
}
