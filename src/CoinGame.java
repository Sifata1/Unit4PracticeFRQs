public class CoinGame {
    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int roundTracker = 1; // *** ADDED TO ENABLE TESTING ***

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }


    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
     * NOTE: THIS CODE WAS NOT PROVIDED IN THE FRQ ("implementation not shown")
     *       BUT IS INCLUDED HERE TO ENABLE TESTING
     */
    public int getPlayer1Move()
    {
        int result;
        if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
        } else if (roundTracker == 3) {
            result = 1;
        } else {
            result = 3;
        }
        roundTracker++;
        return result;
    }


    /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
     * as described in part (a).
     */
    public int getPlayer2Move() {
        int result;
        if (roundTracker %3 == 0) {
            result = 3;
        } else if (roundTracker % 2 == 0) {
            result = 2;
        } else { result =1; }
        return result;
    }


    /** Plays a simulated game between two players, as described in part
     * (b).
     */
    public void playGame() {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        for (int i = 1;i<=maxRounds;i++) {
            int move1 = getPlayer1Move();
            int move2 = getPlayer2Move();
            player1Coins -= move1;
            player2Coins -= move2;

            if (move1 == move2) {
                player2Coins += 1;
            }

            if (move1 != move2 && Math.abs(move1-move2) ==1) {
                player1Coins += 1;
            }

            if (move1 != move2 && Math.abs(move1-move2) ==2) {
                player1Coins += 2;
            }
        }
        if (player1Coins == player2Coins) {
            System.out.println("tie game");
        }

        if (player1Coins > player2Coins) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}

