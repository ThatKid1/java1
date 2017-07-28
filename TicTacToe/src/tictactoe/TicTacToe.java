package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean gameOver = false;
        initBoard();
        displayBoard();
        boolean turn = true;
        while (true) {
            System.out.println("What row would you like to move to?");
            int row = Integer.parseInt(keyboard.nextLine());
            System.out.println("What column?");
            int column = Integer.parseInt(keyboard.nextLine());

            if (turn == true) {
                //xturn 
                board[row][column] = 'x';
                System.out.println();
                turn = false;
            } else {
                //oturn
                board[row][column] = 'o';
                System.out.println();
                turn = true;
            }
            displayBoard();
            if (gameOver()) {
                break;
            }
            if (gameOver() == false) {
                
            }

        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean gameOver() {
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            System.out.println("You Win!");
            return true;
        }
        if ((board[0][0] != ' ') && (board[0][1] != ' ') && (board[0][2] != ' ') && (board[1][0] != ' ') && (board[1][2] != ' ') && (board[2][0] != ' ') && (board[2][1] != ' ') && (board[2][1] != ' ') && (board[2][2] != ' ')) {
            System.out.println("Tie game");
            return true;
        } else {
            return false;
        }

    }
}
