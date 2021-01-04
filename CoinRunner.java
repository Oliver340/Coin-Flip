package ca.bcit.comp1510.lab09;

/**
 * CoinRunner
 * This is a program that flips a coin 100 times and prints the
 *  amount of consecutive heads.
 *
 * @author Ivan (Oliver) Harrison
 * @version 2020
 */
public class CoinRunner {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        final int amountOfFlip = 100;
        int countHeads = 0;
        int consecutiveHeads = 0;
        for (int i = 0; i < amountOfFlip; i++) {
            coin = new Coin();
            System.out.println(coin);
            if (coin.isHeads()) {
                countHeads++;
                if (countHeads > consecutiveHeads) {
                    consecutiveHeads = countHeads;
                }
            } else {
                countHeads = 0;
            }
        }
        System.out.println("The longest run of heads is " + consecutiveHeads);

    }
}
