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

        int ball = 0;
        int columns = 0;

            for(int iterator = 0; iterator<50; iterator++){

                switch(columns) {
                    case 0:
                        if(iterator == 0){
                            System.out.print("  " + "\033[030m");
                        } else {
                            print(ballsDrawn, ball+1);
                            ball++;
                        }
                        break;
                    case 1:
                        print(ballsDrawn, ball+10);
                        break;
                    case 2:
                        print(ballsDrawn, ball+20);
                        break;
                    case 3:
                        print(ballsDrawn, ball+30);
                        break;
                    case 4:
                        print(ballsDrawn, ball+40);
                        break;
                } // end switch

                if(columns < 4) {
                    columns++;
                } else if(columns == 4) {
                    columns = 0;
                    System.out.println();
                }
            }
    }

    private static void print(List<Integer> ballsDrawn, int number) {
        if(ballsDrawn.contains(number)) {
            // print the number in red
            System.out.print("\033[0;31m" + (number) + " "+"\033[030m");
        } else {
            // dont change the color
            System.out.print((number) + " "+"\033[030m");
        }
    }
}
