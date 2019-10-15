package classes;

import enums.Center;
import enums.Corner;
import enums.Edge;
import interfaces.CellLocation;

import static enums.Center.CENTER;
import static enums.Corner.*;
import static enums.Edge.*;

public class Board {

    private Cell gameBoard[][];
    private int size;

    public Board(int boardSize) {
        gameBoard = new Cell[boardSize][boardSize];
        size = boardSize;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell(i, j, false);
                gameBoard[i][j] = cell;
            }
        }
    }

    public Board() {
    }

    void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoard[i][j].getSign() + " ");
            }
            System.out.println(" ");
        }
    }

    void setLiveCell(Point... point) {
        for (Point p : point) {
            gameBoard[p.getX()][p.getY()].setCurrentLive(true);
            gameBoard[p.getX()][p.getY()].setSign("X");
        }
        printBoard();
    }

    private CellLocation getCellLocation(Cell cell) {
        if (cell.getX() == 0 && cell.getY() == 0) {
            return BOTTOMLEFT;
        } else if (cell.getX() == 0 && cell.getY() == size - 1) {
            return TOPLEFT;
        } else if (cell.getX() == size - 1 && cell.getY() == size - 1) {
            return TOPRIGHT;
        } else if (cell.getX() == size - 1 && cell.getY() == 0) {
            return BOTTOMRIGHT;
        } else if (cell.getX() == 0 && (cell.getY() > 0 && cell.getY() < size - 1)) {
            return LEFT;
        } else if ((cell.getX() > 0 && cell.getX() < size - 1) && cell.getY() == 0) {
            return BOTTOM;
        } else if (cell.getX() == size - 1 && (cell.getY() > 0 && cell.getY() < size - 1)) {
            return RIGHT;
        } else if ((cell.getX() > 0 && cell.getX() < size - 1) && cell.getY() == size - 1) {
            return TOP;
        } else {
            //countCenterCell(cell.getX(), cell.getY());
            return CENTER;
        }
    }

    private void changeLiveStatus(Cell cell, int neighboursSum) {
        if (cell.isCurrentLive() && (neighboursSum == 0 || neighboursSum == 1 || neighboursSum > 3)) {
            cell.setFutureLive(false);
            cell.setSign("O");
        }
        if (!cell.isCurrentLive() && neighboursSum == 3) {
            cell.setFutureLive(true);
            cell.setSign("X");
        }
    }

    void createNewGeneration() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = gameBoard[i][j];
                CellLocation cellLocation = getCellLocation(cell);
                NeighbourChecker neighbourChecker = new NeighbourChecker(size, gameBoard);
                int neighboursSum = 0;
                if (cellLocation instanceof Corner) {
                    neighboursSum = neighbourChecker.countCorner(cellLocation, cell);
                } else if (cellLocation instanceof Edge) {
                    neighboursSum = neighbourChecker.countEdge(cellLocation, cell);
                } else if (cellLocation instanceof Center) {
                    neighboursSum = neighbourChecker.countCenterCell(cell);
                }
                changeLiveStatus(gameBoard[i][j], neighboursSum);
            }
        }
    }

    void printNextGenerationBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(gameBoard[i][j].getSign() + " ");
            }
            System.out.println(" ");
        }
    }

}
