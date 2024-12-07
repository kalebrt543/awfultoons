package homework2;

import java.util.Scanner;
//Kaleb Thomas
public class homework2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Game Introduction
     System.out.println("Welcome to the Haunted Manor Adventure!");
     System.out.println("You have entered an old, abandoned manor rumored to be cursed.");
     System.out.println("Your goal is to explore the manor and uncover its secrets... but beware of the dangers inside.");

     // Start of the game
     System.out.println("\nYou stand in the foyer of the manor. There's a grand staircase in front of you.");
     System.out.println("To your left, you see a door leading to the library. To your right, a dark hallway stretches into the unknown.");
     System.out.print("Do you go [U] upstairs, [L] to the library, or [H] down the hallway? ");
     String choice1 = scanner.nextLine().toUpperCase();

     if (choice1.equals("U")) {
         // Upstairs path
         System.out.println("\nYou climb the creaking staircase and find two doors.");
         System.out.println("The door on the left is slightly ajar, and you hear faint whispers.");
         System.out.println("The door on the right is locked but has strange carvings on it.");
         System.out.print("Do you enter the left room (L) or examine the right door (R)? ");
         String choice2 = scanner.nextLine().toUpperCase();

         if (choice2.equals("L")) {
             System.out.println("\nThe room is empty except for a mirror. As you approach, your reflection smiles back at you.");
             System.out.print("Do you touch the mirror (T) or leave the room (L)? ");
             String choice3 = scanner.nextLine().toUpperCase();

             if (choice3.equals("T")) {
                 System.out.println("\nThe mirror pulls you into another dimension! You're trapped forever. Game over!");
             } else {
                 System.out.println("\nYou leave the room and find a hidden passage behind the mirror. You escape the manor safely. You win!");
             }
         } else if (choice2.equals("R")) {
             System.out.println("\nThe carvings glow as you touch the door, and it swings open.");
             System.out.println("Inside, you find a chest. It's locked with a combination.");
             System.out.print("Guess the combination (Hint: It's 3 digits, and the sum is 9): ");
             int combination = scanner.nextInt();

             if (combination == 333) {
                 System.out.println("\nThe chest opens to reveal a hidden treasure. You're rich! You win!");
             } else {
                 System.out.println("\nThe chest releases a trap! You're caught in a magical prison. Game over!");
             }
         } else {
             System.out.println("\nYou hesitate and hear footsteps behind you. Something grabs you! Game over!");
         }
     } else if (choice1.equals("L")) {
         // Library path
         System.out.println("\nThe library is filled with ancient books and cobwebs.");
         System.out.println("You see a glowing book on the table and a ladder leading to the upper shelves.");
         System.out.print("Do you read the glowing book (B) or climb the ladder (C)? ");
         String choice2 = scanner.nextLine().toUpperCase();

         if (choice2.equals("B")) {
             System.out.println("\nThe book contains a spell that teleports you to the basement.");
             System.out.println("In the basement, you see a ghost guarding the exit.");
             System.out.print("Do you confront the ghost (C) or search for another way out (S)? ");
             String choice3 = scanner.nextLine().toUpperCase();

             if (choice3.equals("C")) {
                 System.out.println("\nThe ghost appreciates your bravery and lets you go. You escape the manor. You win!");
             } else {
                 System.out.println("\nWhile searching, you trigger a trapdoor and fall into a pit. Game over!");
             }
         } else if (choice2.equals("C")) {
             System.out.println("\nAs you climb the ladder, you find a secret compartment with an old key.");
             System.out.println("You use the key to unlock a hidden door and escape the manor. You win!");
         } else {
             System.out.println("\nYou hesitate too long, and the library collapses. Game over!");
         }
     } else if (choice1.equals("H")) {
         // Hallway path
         System.out.println("\nThe hallway is dark and eerie. You feel a chill as you walk forward.");
         System.out.println("You see a flickering light coming from a room on the left and stairs leading down to the cellar.");
         System.out.print("Do you enter the lit room (L) or go down to the cellar (C)? ");
         String choice2 = scanner.nextLine().toUpperCase();

         if (choice2.equals("L")) {
             System.out.println("\nThe room contains an old piano. As you approach, it starts playing on its own.");
             System.out.print("Do you listen (L) or run away (R)? ");
             String choice3 = scanner.nextLine().toUpperCase();

             if (choice3.equals("L")) {
                 System.out.println("\nThe music reveals a secret door leading outside. You escape. You win!");
             } else {
                 System.out.println("\nAs you run, you trip and fall. A shadowy figure catches you. Game over!");
             }
         } else if (choice2.equals("C")) {
             System.out.println("\nThe cellar is cold and damp. You see a strange glowing orb on a pedestal.");
             System.out.print("Do you touch the orb (T) or leave it alone (L)? ");
             String choice3 = scanner.nextLine().toUpperCase();

             if (choice3.equals("T")) {
                 System.out.println("\nThe orb grants you the power to teleport. You teleport out of the manor. You win!");
             } else {
                 System.out.println("\nAs you leave the orb, the cellar collapses. You're trapped. Game over!");
             }
         } else {
             System.out.println("\nYou hesitate, and the hallway fills with darkness. Game over!");
         }
     } else {
         System.out.println("\nInvalid choice. You remain frozen in fear and never leave the foyer. Game over!");
     }

     scanner.close();
 }
}
