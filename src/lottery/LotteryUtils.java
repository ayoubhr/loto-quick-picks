package lottery;

import java.util.ArrayList;
import java.util.List;

public class LotteryUtils {

    public static List<Integer> yourLuckyNumbers() {

        List<Integer> ballsDrawn = new ArrayList<>();

        do {
            int randomNumber = (int) (Math.random() * (49 - 1 + 1) + 1);
            if (!ballsDrawn.contains(randomNumber)) {
                ballsDrawn.add(randomNumber);
            }
        } while (ballsDrawn.size() < 6);

        return ballsDrawn;
    }

    public static void paintYourDraw(List<Integer> ballsDrawn) {

        System.out.println("\033[0;32m" + "\nDrawn balls: " + ballsDrawn + "\n");

        int number = 0;

        for(int rows = 0; rows<10; rows++){
            for(int columns = 0; columns<5; columns++){

                switch(columns) {
                    case 0:
                        if(rows+columns == 0){
                            System.out.print("  " + "\033[030m");
                        } else {
                            toStr(ballsDrawn, number+1);
                            number++;
                        }
                        break;
                    case 1:
                        toStr(ballsDrawn, number+10);
                        break;
                    case 2:
                        toStr(ballsDrawn, number+20);
                        break;
                    case 3:
                        toStr(ballsDrawn, number+30);
                        break;
                    case 4:
                        toStr(ballsDrawn, number+40);
                        break;
                }
            }
            System.out.println();
        }
    }

    private static void toStr(List<Integer> ballsDrawn, int number) {
        if(ballsDrawn.contains(number)) {
            System.out.print("\033[0;31m" + (number) + " "+"\033[030m");
        } else {
            System.out.print((number) + " "+"\033[030m");
        }
    }
}
