package pl.sdacademy.java14poz.grudzien0809.zadanie_6_Games;

import java.util.Random;

public class TicTacToe {

    final static char HUMAN = 'x';
    final static char COMPUTER = 'O';
    private char[][] board = new char[3][3];

    public TicTacToe() {
        drawBoard();
    }

    private void playMove(int fieldNumber, char playerChar) throws Exception {       // nie skończone
        int currentFieldNumber = 1;
        mainLoop:
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (currentFieldNumber == fieldNumber) {
                    if (Character.isLetter(board[x][y])) {
                        throw new Exception("Nieprawidłowy ruch");
                    }
                    board[x][y] = playerChar;
                    //drawBoard();
                    break mainLoop;
                }
                currentFieldNumber++;
            }
        }
    }

    public void playMove(int fieldNumber) throws Exception {
        playMove(fieldNumber, HUMAN);
        playComputer();
    }

    public void playComputer() {        // nie skończone
        Random random = new Random();
        boolean exit = false;
        while (!exit) {
            try {
                playMove(random.nextInt(9) + 1, COMPUTER);
                exit = true;
            } catch (Exception e) {

            }
        }
        drawBoard();
    }

    private boolean isLegalMove (int fieldNumber) {        // nie skończone

        return false;
    }

    private boolean isWin(char play) {                 // nie skończone

        return false;
    }

    private void drawBoard() {
        int fieldNumber = 1;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (Character.isLetter(board[x][y])) {
                    System.out.print(board[x][y]);
                } else {
                    System.out.print(fieldNumber);
                }
                fieldNumber++;
            }
            System.out.println();
        }
    }

}
