package r.exam01;

import java.util.Random;

public class ComputerPlayer extends Player {
    private static Random rand;
    static {
        rand = new Random();
    }

    public int nextHand(){
        return rand.nextInt(3);
    }
}
