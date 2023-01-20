import models.Art;
import player.Player;

import java.io.*;
import java.util.Scanner;

public class MedievalGame {

    private Player player;



    public static void main(String[] args) throws IOException {

        Scanner console = new Scanner(System.in);
        MedievalGame game = new MedievalGame();

        game.player = game.start(console);

        game.addDelay(500);
        System.out.println("\nLet's take a quick look at you to make sure you're ready to head out the door.");
        System.out.println(game.player);

        game.addDelay(1000);
        System.out.println("\nWell, you're off to a good start, let's get your game saved so we don't lose it.");
        game.save();

        game.addDelay(2000);
        System.out.println("We just saved your game...");
        System.out.println("Now we are going to try to load your character to make sure the save worked...");

        game.addDelay(1000);
        System.out.println("Deleting character...");
        String charName = game.player.getName();
        game.player = null;

        game.addDelay(1500);
        game.player = game.load(charName, console);
        System.out.println("Loading character...");

        game.addDelay(2000);
        System.out.println("Now let's print out your character again to make sure everything loaded:");

        game.addDelay(500);
        System.out.println(game.player);
    } // End of main

    /* Instance Methods */
    private Player start(Scanner console) {
        // Add start functionality here
        Player player;
        Art.homeScreen();
        System.out.println("Welcome to your latest adventure!");
        System.out.println("Tell me traveler, have you been here before?");
        System.out.print("   Enter 'y' to load a game, 'n' to create a new game: ");
        String answer = console.next().toLowerCase();

        if (answer.equals("y")){
            System.out.println("Please enter the previous character name");
            String previousCharacterName = console.next().toLowerCase();
            player = load(previousCharacterName,console);
            return player;
        } else if ( answer.equals("n")){
            System.out.println("Please enter your character name");
            String newPlayerName = console.next().toLowerCase();
            player = new Player(newPlayerName);
            return player;
        }   else {
            System.out.println("Please enter 'y' or 'n' ");
            answer = console.next().toLowerCase();
            player = new Player(answer);
        }

        return player;
    } // End of start

    private void save() throws IOException {
        // Add save functionality here
        String fileName = player.getName() + ".svr";
        try {
            FileOutputStream fileSaverStream = new FileOutputStream(fileName);
            ObjectOutputStream playerSaver = new ObjectOutputStream(fileSaverStream);
            playerSaver.writeObject(this.player);
            playerSaver.close();
        } catch (IOException e){
            System.out.println("Unable to save the game data properly.");
        }

    } // End of save

    private Player load(String playerName, Scanner console) {
        // Add load functionality here
        Player loadedPlayer;

        try{
            FileInputStream loaderStream = new FileInputStream(playerName + ".svr");
            ObjectInputStream playerLoader = new ObjectInputStream(loaderStream);
            loadedPlayer = (Player) playerLoader.readObject();

            playerLoader.close();
        } catch (IOException | ClassNotFoundException e) {
            addDelay(1500);
            System.out.println("There has been an error loading your saved file...");
            addDelay(2000);
            loadedPlayer = new Player(playerName);
        }
        return loadedPlayer;
    } // End of load

    // Adds a delay to the console so it seems like the computer is "thinking"
    // or "responding" like a human, not instantly like a computer.
    private void addDelay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}