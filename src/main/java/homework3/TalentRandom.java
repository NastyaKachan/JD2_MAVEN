package homework3;

import java.util.Random;

public class TalentRandom {

    public static double getRandomTalent(){
        Random random = new Random();
        double talent = random.nextDouble() * 0.9 + 0.1;
        return Math.round(talent * 10.0) / 10.0;
    }

}
