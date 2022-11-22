public class FRQSolutions {
    public FRQSolutions() {}


    public void printNums(int value, int numRounds) {
        String num = "";
        int randomNum = (int) (Math.random()*9);
        for (int i= 1; i<=numRounds; i++) {
            randomNum = (int) (Math.random()*9);
            while (randomNum != value) {
                randomNum = (int) (Math.random()*9);
                num += randomNum;
            }
            System.out.println(num);
            num = "";
        }
    }

    public String longestStreak(String str) {
        int highestStreak = 0;
        int currentStreak = 0;
        String currentChar = "";
        String highestChar = "";

        for (int i = 0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                currentStreak +=1;
            } else currentStreak =1;
            if (currentStreak>highestStreak) {
                highestStreak = currentStreak;
                highestChar = String.valueOf(str.charAt(i));
            }
            if (currentStreak == highestStreak) {}
        }
        return highestChar + " " + highestStreak;
    }



}
