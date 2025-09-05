/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab5;

import java.util.Locale;
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
      System.out.println("Your hand: " + game.getYourCards());
      System.out.println("House's hand: " + game.getHouseCards());
      System.out.println("Your score: " + game.score(game.getYourCards()));
      System.out.println("House's score: " + game.score(game.getHouseCards()));
    }

  @Override
    public boolean hitMe() {
System.out.println("Hit? (y/n)");
String answer = user.nextLine().trim().toLowerCase(Locale.ITALY);
return answer.equals("y");
    }

  @Override
    public void gameOver() {
        
        int userScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        
        System.out.println("Game is over.");
        System.out.println("Your score: " + userScore);
        System.out.println("House's score: " + houseScore);

        if (userScore > 21) {
            System.out.println("House Wins!");
        } else if (houseScore > 21) {
            System.out.println("You Win!");
        } else if (userScore > houseScore) {
            System.out.println("You win!");
        } else if (houseScore > userScore) {
            System.out.println("House Wins!");
        } else {
            System.out.println("Tie Game!");
        }
    }

}