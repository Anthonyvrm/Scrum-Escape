package monster;

import Interface.IMonster;

//Trollo is een chaotische trol dat door digitale borden kruipt, kaartjes versleept en verantwoordelijkheden vervaagt.
//Hij leeft van onduidelijke statusupdates, vergeten taken en kaarten zonder eigenaar.
//Zijn aanwezigheid zorgt ervoor dat niemand nog weet wat “To Do”, “Doing” of “Done” betekent.

public class Trollo implements IMonster {
    // Prints a random quote when a monster takes damage.
    @Override
    public void takeDamageQuote(){

        int randomInt = (int)(Math.random() * 5);
        switch (randomInt) {
            case 0:
                System.out.println("Are you updating the board?! Stop that!");
                break;
            case 1:
                System.out.println("Labels? Assignments? Noooo!");
                break;
            case 2:
                System.out.println("You can’t just... drag cards correctly!");
                break;
            case 3:
                System.out.println("A checklist? That’s cheating!");
                break;
            case 4:
                System.out.println("Wait — you're organizing?!");
                break;
        }
    }

    // Prints a random quote when a monster deals damage.
    @Override
    public void dealDamageQuote(){

        int randomInt = (int)(Math.random() * 5);
        switch (randomInt) {
            case 0:
                System.out.println("Oops! I moved your critical task to 'Later... maybe'.");
                break;
            case 1:
                System.out.println("To Do? Doing? Who’s asking?");
                break;
            case 2:
                System.out.println("I just archived your priority. You’re welcome.");
                break;
            case 3:
                System.out.println("Let’s rename everything and act like it makes sense.");
                break;
            case 4:
                System.out.println("I replaced your status labels... with emojis!");
                break;

        }
    }
}