package methodsExcersises;

public class Main10 {

    public static void main(String[] args) {
        String scoreFinal = footbalWin(6, 2, 5, 3);
        System.out.println(scoreFinal);

    }

    public static String footbalWin(int aTeamGoalsHome, int aTeamGoalsAway, int bTeamGoalsHome, int bTeamGoalsAway) {
        String score = "0";
        if ((aTeamGoalsHome + aTeamGoalsAway) > (bTeamGoalsHome + bTeamGoalsAway)) {//więce goli łącznie dla a
            score = "1";
            } else if ((bTeamGoalsHome + bTeamGoalsAway) > (aTeamGoalsHome + aTeamGoalsAway)) {//więce goli łącznie dla b
            score = "2";
            }
        else {//jeśli remis, to:
            if (aTeamGoalsAway > bTeamGoalsAway) {//porównuje ilość bramek w domu dla a
                score = "1";
            }
            else if (bTeamGoalsAway > aTeamGoalsAway) {//porównuje ilość bramek w domu dla b
                score = "2";
            }
            else {//jeśli w domowych bramkach jest również remis, zrób:
                score = "X";
            }
        }
        return score;
    }
}
