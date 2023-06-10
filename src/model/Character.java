package model;

public class Character extends Kozos {
    // Vegyél fel három fieldet: name (String), health (int) és level (int)

    private int level;


    // Írj egy egy paraméteres kosntruktort ami beállítja a nevet és a health 100-ra, a levelt pedig 1-re állítja!
    public Character(String name) {
        super(name, 100);
        this.level = 1;
    }

    public void attack(Monster monster) {
        // Írd ki: [játékos neve] attacks [szötny neve]!
        System.out.println(super.getName() + " attacks " + monster.getName());
        // Készíts egy damage változót, legyen az értéke a level 10-szerese!
        int damage = level * 10;
        // Vond le ezt az értéket a szörny health-jéből!
        monster.setHealth(monster.getHealth() - damage);

        // Írd ki: Dealt [damage változó értéke] damage to [játékos neve]!
        System.out.println("Dealt " + damage + " damage to " + monster.getName());

        // Ha a szörny élete 0 vagy kisebb, írd ki: [szörny neve] has been defeated!
        if (monster.getHealth() <= 0) {
            level += 2;
            System.out.println(monster.getName() + " has been defeated! ");
        }
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
