package lottery;

public class LotteryUtils {

    public static int[] yourLuckyNumbers() {

        int[] ballsDrawn = new int[6];
        int randomNumber;

        for(int i = 0; i<ballsDrawn.length; i++){

            boolean isBallDrawn = true;

            do {
                randomNumber = (int)(Math.random()*(49-1+1)+1);
                if (i == 0) {
                    ballsDrawn[i] = randomNumber;
                    isBallDrawn = false;
                } else if (i == 1) {
                    if (randomNumber != ballsDrawn[0]) {
                        isBallDrawn = false;
                        ballsDrawn[i] = randomNumber;
                    }
                } else if (i == 2) {
                    if (randomNumber != ballsDrawn[0] && randomNumber != ballsDrawn[1]) {
                        ballsDrawn[i] = randomNumber;
                        isBallDrawn = false;
                    }
                } else if (i == 3) {
                    if (randomNumber != ballsDrawn[0] && randomNumber != ballsDrawn[1] && randomNumber != ballsDrawn[2]) {
                        ballsDrawn[i] = randomNumber;
                        isBallDrawn = false;
                    }
                } else if (i == 4) {
                    if (randomNumber != ballsDrawn[0] && randomNumber != ballsDrawn[1] && randomNumber != ballsDrawn[2]
                            && randomNumber != ballsDrawn[3]) {

                        ballsDrawn[i] = randomNumber;
                        isBallDrawn = false;
                    }
                } else {
                    if (randomNumber != ballsDrawn[0] && randomNumber != ballsDrawn[1] && randomNumber != ballsDrawn[2]
                            && randomNumber != ballsDrawn[3] && randomNumber != ballsDrawn[4]) {

                        ballsDrawn[i] = randomNumber;
                        isBallDrawn = false;
                    }
                }
            } while (isBallDrawn);
        }
        return ballsDrawn;
    }

    public static void paintYourDraw(int[] ballsDrawn) {

        System.out.println("\033[1;37m" + "\nDrawn balls: " + ballsDrawn[0] + " " + ballsDrawn[1] + " "
                + ballsDrawn[2] + " " + ballsDrawn[3] + " "
                + ballsDrawn[4] + " " + ballsDrawn[5] + "\033[1;37m" + "\n");

        int number = 0;

        for(int rows = 0; rows<10; rows++){
            for(int columns = 0; columns<5; columns++){

                if(columns == 0){
                    if(rows+columns == 0){
                        System.out.print("  "+"\033[030m");
                    } else {
                        if(number == ballsDrawn[0]-1 || number == ballsDrawn[1]-1 ||
                                number == ballsDrawn[2]-1 || number == ballsDrawn[3]-1 ||
                                number == ballsDrawn[4]-1 || number == ballsDrawn[5]-1) {

                            System.out.print("\033[0;31m" + (number+1) + " "+"\033[030m");

                        } else {
                            System.out.print((number+1) + " "+"\033[030m");
                        }
                        number++;
                    }
                } else if(columns == 1){
                    if(number+10 == ballsDrawn[0] || number+10 == ballsDrawn[1] ||
                            number+10 == ballsDrawn[2] || number+10 == ballsDrawn[3] ||
                            number+10 == ballsDrawn[4] || number+10 == ballsDrawn[5]) {

                        System.out.print("\033[0;31m" + (number+10) + " "+"\033[030m");

                    } else {
                        System.out.print((number+10) + " "+"\033[030m");
                    }
                } else if(columns == 2){
                    if(number+20 == ballsDrawn[0] || number+20 == ballsDrawn[1] ||
                            number+20 == ballsDrawn[2] || number+20 == ballsDrawn[3] ||
                            number+20 == ballsDrawn[4] || number+20 == ballsDrawn[5]) {

                        System.out.print("\033[0;31m" + (number+20) + " "+"\033[030m");

                    } else {
                        System.out.print((number+20) + " "+"\033[030m");
                    }
                } else if(columns == 3){
                    if(number+30 == ballsDrawn[0] || number+30 == ballsDrawn[1] ||
                            number+30 == ballsDrawn[2] || number+30 == ballsDrawn[3] ||
                            number+30 == ballsDrawn[4] || number+30 == ballsDrawn[5]) {

                        System.out.print("\033[0;31m" + (number+30) + " "+"\033[030m");

                    } else {
                        System.out.print((number+30) + " "+"\033[030m");
                    }
                } else {
                    if(number+40 == ballsDrawn[0] || number+40 == ballsDrawn[1] ||
                            number+40 == ballsDrawn[2] || number+40 == ballsDrawn[3] ||
                            number+40 == ballsDrawn[4] || number+40 == ballsDrawn[5]) {

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
