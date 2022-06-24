package lottery;

import java.util.List;

public class Lottery {

    public static void main(String[] args) {

        double start = System.currentTimeMillis();

        List<Integer> ballsDrawn = LotteryUtils.yourLuckyNumbers();

        LotteryUtils.paintYourDraw(ballsDrawn);

        double end = System.currentTimeMillis();

        System.out.println("\033[0;32m" + "\nExecution time: " + ((end - start)/1000) + " seconds");
    }
    
}
