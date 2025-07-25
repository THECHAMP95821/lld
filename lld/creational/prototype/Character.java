package lld.creational.prototype;

public class Character implements Cloneable {
    private String name;
    private int health;
    private int attackPower;
    private int level;

    public Character(String name, int health, int attackPower, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone(); // Shallow copy
    }

    // Getter methods
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }
    public int getLevel() { return level; }

    public void showCharacterInfo() {
        System.out.println("Character [Name=" + name + ", Health=" + health
                + ", AttackPower=" + attackPower + ", Level=" + level + "]");
    }
}
