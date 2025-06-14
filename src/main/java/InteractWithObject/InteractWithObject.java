package InteractWithObject;

import Interface.*;
import classes.Monster;
import classes.Player;
import classes.Room;

import java.util.Scanner;

public class InteractWithObject {
    // Interfaces which belong each to a different interactable object.
    private final IReadable readableObject;
    private final IWeapon weapon;
    private final IRewardable reward;
    Scanner scanner = new Scanner(System.in);
    private Player player;
    private Monster monster ;

    // Constructor which initializes interactable room objects.
    public InteractWithObject(IReadable readableObject, IWeapon weapon, IRewardable reward, Monster monster) {
        this.readableObject = readableObject;
        this.weapon = weapon;
        this.reward = reward;
        this.monster = monster;
        
    }

    // Handle book interaction.
    private void useReadable() {
        if (readableObject != null) {
            readableObject.showMessage();
        } else {
            System.out.println("There is no book in this room!");
        }
    }

    // Handle weapon interaction.
    private void useWeapon() {
        if (weapon !=null ) {
            weapon.attack(monster);
        } else {
            System.out.println("There is no weapon in this room!");
        }
    }

    // Handle reward interaction.
    private void useReward(Player player) {
        if (reward != null) {
            reward.grantReward(player);
        } else {
            System.out.println("There is no reward available in this room!");
        }
    }

    // Handle player input interaction with objects.
    public void interactWithObject(Player player) {
        DisplayOptions displayOptions = new DisplayOptions(readableObject, weapon, reward);

        if (readableObject == null && weapon == null && reward == null) {
            System.out.println("There are no objects in this room!");
            return;
        }

        displayOptions.displayOptions();

        while (true) {
            System.out.print("Enter your choice (1, 2, 3 or 4): ");
            System.out.println ();

            // Check if input is an integer.
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next();
                continue;
            }

            int input = scanner.nextInt();
                // The Player uses an object based on input.
                switch (input) {
                    case 1 -> { useReadable();// Book.
                              return; }
                    case 2 -> { useWeapon(); // Weapon.
                              return; }
                    case 3 -> { useReward(player); // Reward.
                              return; }
                    case 4 -> { System.out.println ("You chose not to interact with an object.");
                              return; // Exit.
                    }
                    default -> System.out.println("Invalid input! Please choose 1, 2, 3 or 4.");
                }
            }
        }
    }




