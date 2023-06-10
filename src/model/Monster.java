package model;

public class Monster {

    // Vegyél fel két fieldet: name (String) és health (int)
    private String name;
    private int health;

    // Írj egy két paraméteres kosntruktort ami beállítja az attribútumok értékeit!
    public Monster (String name, int health, int level){
        this.name = name;
        this.health = 100;

    }

    public void attack(Character player) {
        // Írd ki: [szörny neve] attacks [játékos neve]!

        // Csökkentsd a játékos életét 20-szal!

        // Írd ki: Dealt 20 damage to [játékos neve]!

        // Ha a játékos élete 0 vagy kisebb, írd ki: [játékos neve] has been defeated!

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}