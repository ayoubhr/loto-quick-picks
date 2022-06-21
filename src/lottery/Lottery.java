package lottery;

public class Lottery {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int[] ballsDrawn = LotteryUtils.yourLuckyNumbers();

        LotteryUtils.paintYourDraw(ballsDrawn);

        long end = System.currentTimeMillis();

        System.out.println("\033[1;37m" + "\nExecution time: " + (end - start) + "ms"+"\033[1;37m");
    }
    
}
