package test;

import fan.Direction;
import fan.FanImp;

public class FanImpTest {

    public void main(String args[]) {
        testTurnsOff();
        testSpeedCycles();
        testPullReverseString();
        testReverseOnSpeed();
    }

    public void testTurnsOff() {

        FanImp f = new FanImp();
        f.pullSpeedString();

        if (f.fanSpeed != f.OFF_SETTING) {
            System.err.println("Failed test testTurnsOff");
            System.exit(0);
        }
    }

    public void testSpeedCycles() {
        FanImp f = new FanImp();
        f.pullSpeedString();
        System.out.println("Fan : " + f);

        if (f.fanSpeed != 1) {
            System.err.println("Failed test testSpeedCycles for speed 1");
            System.exit(0);
        }

        f.pullSpeedString();
        if (f.fanSpeed != 2) {
            System.err.println("Failed test testSpeedCycles for speed 2");
            System.exit(0);
        }

        f.pullSpeedString();
        if (f.fanSpeed != 3) {
            System.err.println("Failed test testSpeedCycles for speed 3");
            System.exit(0);
        }

        f.pullSpeedString();
        if (f.fanSpeed != f.OFF_SETTING) {
            System.err.println("Failed test testSpeedCycles for speed 3");
            System.exit(0);
        }
    }
    public void testPullReverseString() {
        FanImp f = new FanImp();
        f.pullReverseString();
        System.out.println("Fan : " + f);

        if (!f.fanDirection.equals(Direction.BACKWARD)) {
            System.err.println("Failed test testPullReverseString");
            System.exit(0);
        }
    }
    public void testReverseOnSpeed() {
        FanImp f = new FanImp();
        f.pullSpeedString();
        f.pullReverseString();
        System.out.println("Fan : " + f);

        if (f.fanSpeed != 1 && !f.fanDirection.equals(Direction.BACKWARD) ) {
            System.err.println("Failed test testReverseOnSpeed for speed 1");
            System.exit(0);
        }

        f.pullSpeedString();
        f.pullReverseString();
        if (f.fanSpeed != 2 &&  !f.fanDirection.equals(Direction.BACKWARD)) {
            System.err.println("Failed test testReverseOnSpeed for speed 2");
            System.exit(0);
        }

        f.pullSpeedString();
        f.pullReverseString();
        if (f.fanSpeed != 3 && !f.fanDirection.equals(Direction.BACKWARD)) {
            System.err.println("Failed test testReverseOnSpeed for speed 3");
            System.exit(0);
        }
    }
}
