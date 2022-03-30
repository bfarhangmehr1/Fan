package fan;

public class FanImp {


    // initializing final variables

    public final int OFF_SETTING = 0;

    // initializing variable

    public int fanSpeed = OFF_SETTING;

    public Direction fanDirection = Direction.BACKWARD;


    /**
     * using ternary operator to identify fan speed based on the requirements
     */
    public void pullSpeedString() {

        fanSpeed = (fanSpeed == 3) ? OFF_SETTING : fanSpeed++;

    }

    /**
     * using ternary operator to identify fan reverse cycling based on the requirements
     */
    public void pullReverseString() {

        fanDirection = (fanDirection == Direction.FORWARD) ? Direction.BACKWARD : Direction.FORWARD;

    }

    @Override
    public String toString() {

        return String.format("The fan is working on %d speed in %s direction", fanSpeed, fanDirection);
    }

}
