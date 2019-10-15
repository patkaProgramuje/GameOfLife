package classes;

import builder.Person;

import java.util.HashMap;
import java.util.Map;

public class Game {

    public static void main(String args[]) {

        Board board = new Board(10);
        board.setLiveCell(new Point(2, 3), new Point(3, 4), new Point(3, 5), new Point(3, 6), new Point(6, 8));
        board.createNewGeneration();
        System.out.println("/-----------------------------/");
        board.printNextGenerationBoard();

        Person person = new Person.Builder().build();

        Map<String, String> someMap = new HashMap<>();

    }

    //new Tour(boardSize, points, numberOfGenerations).start()
}
