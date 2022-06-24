package lottery;

import java.util.List;

public class Lottery {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Integer> ballsDrawn = LotteryUtils.yourLuckyNumbers();

        LotteryUtils.paintYourDraw(ballsDrawn);

        long end = System.currentTimeMillis();

        System.out.println("\033[1;37m" + "\nExecution time: " + (end - start) + "ms"+"\033[1;37m");
    }
    
}
