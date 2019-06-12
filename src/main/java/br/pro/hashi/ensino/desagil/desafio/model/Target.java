package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    private void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }

    public void moveRandom() {
        Random gerador = new Random();
        int row_add_random = gerador.nextInt((1 - (-1)) + 1) + (-1);
        int col_add_random = gerador.nextInt((1 - (-1)) + 1) + (-1);
        int row_random = row + row_add_random;
        int col_random = col + col_add_random;

        if (row_random > 0 && row_random < board.getNumRows() && col_random > 0 && col_random < board.getNumCols() && !board.isWall(row_random, col_random)) {
            move(row_add_random,col_add_random);
        }
        else {
            move(0,0);
        }
    }


}