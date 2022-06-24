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

        System.out.println("\033[1;37m" + "\nDrawn balls: " + ballsDrawn +"\033[1;37m" + "\n");

        int number = 0;

        for(int rows = 0; rows<10; rows++){
            for(int columns = 0; columns<5; columns++){

                if(columns == 0){
                    if(rows+columns == 0){
                        System.out.print("  "+"\033[030m");
                    } else {
                        if(ballsDrawn.contains(number+1)) {

                            System.out.print("\033[0;31m" + (number+1) + " "+"\033[030m");

                        } else {
                            System.out.print((number+1) + " "+"\033[030m");
                        }
                        number++;
                    }
                } else if(columns == 1){
                    if(ballsDrawn.contains(number+10)) {

                        System.out.print("\033[0;31m" + (number+10) + " "+"\033[030m");

                    } else {
                        System.out.print((number+10) + " "+"\033[030m");
                    }
                } else if(columns == 2){
                    if(ballsDrawn.contains(number+20)) {

                        System.out.print("\033[0;31m" + (number+20) + " "+"\033[030m");

                    } else {
                        System.out.print((number+20) + " "+"\033[030m");
                    }
                } else if(columns == 3){
                    if(ballsDrawn.contains(number+30)) {

                        System.out.print("\033[0;31m" + (number+30) + " "+"\033[030m");

                    } else {
                        System.out.print((number+30) + " "+"\033[030m");
                    }
                } else {
                    if(ballsDrawn.contains(number+40)) {

                        System.out.print("\033[0;31m" + (number+40) + " "+"\033[030m");

                    } else {
                        System.out.print((number+40) + " "+"\033[030m");
                    }
                }
            }
            System.out.println();
        }
    }
}
