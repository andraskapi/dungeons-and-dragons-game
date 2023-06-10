import model.Character;
import model.Monster;


import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Kérd meg a felhasználót, hogy adja meg a karaktere nevét és ezt olvasd be egy változóba!
        // (Használj Scannert!)
        System.out.println("Enter your character's name : ");

        Scanner sc = new Scanner(System.in);


        // Példányosíts egy Charactert (hívd meg a konstruktorát) ezzel a változóval!
        Character playerOne = new Character(sc.nextLine());

        // Írd ki: Welcome, [játékos neve]!
        System.out.println("Welcome " + playerOne.getName() + "HP: " + playerOne.getHealth() +
                "damage: " + playerOne.getLevel() * 10 + "!");

        // Készíts egy 3 hosszúságú tömböt Monster-ekből!
        Monster[] monsters = new Monster[3];

        // Töltsd fel szörnyekkel! Példa: monsters[0] = new Monster("Goblin", 50);
        monsters[0] = new Monster("Orc", 30);
        monsters[1] = new Monster("Troll", 90);
        monsters[2] = new Monster("Tauren", 100);


        // Készíts egy gameOver nevű logikai változót, állítds az értékét false-ra!
        boolean gameOver = false;

        // Írj egy ciklust, ami addig tart amíg nincs vége a játéknek (amíg a gameOver nem true) ÉS
        // amíg a karakter élete 0-nál nagyobb!

        while (!gameOver && playerOne.getHealth() > 0) {




            // Írd ki: Choose a monster to fight or quit:
            System.out.println("Choose a monster to fight or quit: ");

            // Írd ki: 0: Quit
            System.out.println("0: Quit");

            // Írd ki a Monstereket tartalmazó tömb összes elemének a nevét ebben a formátumban:
            // 1: Goblin
            // 2: Troll
            // 3: Dragon
            System.out.println("1: " + monsters[0]);
            System.out.println("2: " + monsters[1]);
            System.out.println("3: " + monsters[2]);

            // Olvasd be egy choice nevű változóba a felhasználótól, hogy mit választ: kilép vagy valamelyik
            // szörnnyel harcol!
            int choice = sc.nextInt();

            sc.nextLine();
            Monster chosenMonster = null;

            // Ha azt választja, hogy kilép (0), írd ki: Thanks for playing! Goodbye.
            // És állítsd be a gameOver változó értékét true-ra!
            if (choice == 0){
                System.out.println("Thanks for playing! Goodbye.");
                gameOver = true;
            } else if (choice <= monsters.length && choice >= 1 ) {
                chosenMonster = monsters[choice - 1];

            }else {
                System.out.println("Invalid choice! ");
            }

            // Ha jó inputot ad meg (1 és tömb hossza között) és harcol:
            // Tárold el egy Monster típusú változóban, hogy melyiket választotta a felhasználó!
            while (playerOne.getHealth() > 0 && chosenMonster.getHealth() > 0 ){
                playerOne.attack(chosenMonster);
                if (chosenMonster.getHealth() > 0){
                    chosenMonster.attack(playerOne);
                }

            }



            // Írj egy ciklust, ami addig megy, amíg a szörny és a játékos élete is nagyobb mint 0!
            // Támadja meg a felhasználó karaktere a szörnyet!
            // Ha a szörny élete továbbra is nagyobb, mint 0, akkor a szörny támadjon vissza!

            // Ha rossz inputot ad meg, írd ki: Invalid choice!
        }

    }
}
