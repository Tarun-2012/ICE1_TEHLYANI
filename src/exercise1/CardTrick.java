package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (Math.random()* 13 + 1));
            card.setSuit(card.SUITS[random.nextInt(4)]);
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
         for(int i = 0; i < hand.length; i++)
         {
          System.out.println(hand[i]);
         }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value on card");
        int number = input.nextInt();
        System.out.println("Enter your suit");
        String cardName = input.next();
        
        Card user = new Card();
        user.setValue(number);
        user.setSuit(cardName);
        
        for(int i=0;i<hand.length;i++)
        {
        
            if(user.getValue() == hand[i].getValue() && user.getSuit().equalsIgnoreCase(hand[i].getSuit()))
            {
            System.out.println("card matched in round " + (i+1));
            printInfo();
            break;
            }
            else
            {
            System.out.println("Sorry, Your card is not matched ");
            }
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Tarun, but you can call me buddy, bro or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To become a software developer");
        System.out.println("-- My goal is to score 3.8 gpa");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Gym");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing Sports");

        System.out.println();
        
    
    }

}
