package classes;

import interfaces.CellLocation;

import static enums.Corner.*;
import static enums.Edge.*;

public class NeighbourChecker {

    private int size;
    private Cell[][] gameBoard;

    public NeighbourChecker(int boardSize, Cell[][] board) {
        size = boardSize;
        gameBoard = board;
    }

    int countCenterCell(Cell cell) {
        int neighboursSum = 0;
        if (gameBoard[cell.getX() - 1][cell.getY()].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX() - 1][cell.getY() + 1].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX()][cell.getY() + 1].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX() + 1][cell.getY() + 1].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX() + 1][cell.getY()].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX() + 1][cell.getY() - 1].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX()][cell.getY() - 1].isCurrentLive()) {
            neighboursSum += 1;
        }
        if (gameBoard[cell.getX() - 1][cell.getY() - 1].isCurrentLive()) {
            neighboursSum += 1;
        }
        return neighboursSum;
    }

    int countEdge(CellLocation edge, Cell cell) {
        int neighboursSum = 0;
        if (LEFT.equals(edge)) {
            if (gameBoard[cell.getX()][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
        } else if (TOP.equals(edge)) {
            if (gameBoard[cell.getX() + 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][0].isCurrentLive()) {
                neighboursSum += 1;
            }
        } else if (RIGHT.equals(edge)) {
            if (gameBoard[cell.getX()][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][cell.getY() - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
        } else if (BOTTOM.equals(edge)) {
            if (gameBoard[cell.getX() - 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() - 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
        }
        return neighboursSum;
    }

    int countCorner(CellLocation corner, Cell cell) {
        int neighboursSum = 0;
        if (BOTTOMLEFT.equals(corner)) {
            if (gameBoard[cell.getX()][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
        } else if (TOPLEFT.equals(corner)) {
            if (gameBoard[cell.getX() + 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX() + 1][size - 1 - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[cell.getX()][size - 1 - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][size - 1 - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[1][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][0].isCurrentLive()) {
                neighboursSum += 1;
            }
        } else if (TOPRIGHT.equals(corner)) {
            if (gameBoard[size - 1 - 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1 - 1][size - 1 - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][size - 1 - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1 - 1][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][size - 1 - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][0].isCurrentLive()) {
                neighboursSum += 1;
            }
        } else if (BOTTOMRIGHT.equals(corner)) {
            if (gameBoard[size - 1 - 1][cell.getY()].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1 - 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][cell.getY() + 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][0].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1 - 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[size - 1][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
            if (gameBoard[0][size - 1].isCurrentLive()) {
                neighboursSum += 1;
            }
        }
        return neighboursSum;
    }
}
