package com.company;

public class Messages {

    String gameStarted() {
        return "Игра началась, на столе 20 спичек";
    }

    String countMatches(int countMatches) {
        return "На столе осталось " +
                countMatches +
                "\sспичек";
    }

    String oneMatch(String player) {
        return "-" +
                player +
                " проиграл\n" + "На столе осталась последняя спичка";
    }

    String zeroMatches(String player) {
        return "-" +
                player +
                " проиграл\n"
                + "Забрал со стола последнюю спичку";
    }

    String playerMove(String player) {
        return " -" + player +
                " ваш ход: ";
    }

    String botMove(int step) {
        return " -Бот забрал: " +
                step +
                (step == 1 ? " спичку" : " спички");
    }

    String playerWin(String player) {
        return "+" + player + "\sвыиграл партию";
    }

}
