package com.sunshine;

/**
 * Hello world!
 *
 */
public class Character {
    // Properties
    private String name;
    private Integer level;
    private String weapon;
    private String secondary;
    private String armor;
    private int health;
    private int mana;

    // Constructor
    public Character(String name, Integer level, String weapon, String secondary, String armor, int health, int mana) {
        this.name = name;
        this.level = level;
        this.weapon = weapon;
        this.secondary = secondary;
        this.armor = armor;
        this.health = health;
        this.mana = mana;
    }

    // Default Constructor
    public Character() {}

    // GETTERS
    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSecondary() {
        return secondary;
    }

    public String getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    // SETTERS
    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    // METHODS
    public String levelUp() {
        setLevel(this.level + 1); 
        return String.format("HERO: %s has LEVELED-UP to LVL %d%n", this.name, this.level);
    }

    public String updateWeapon(String newWeapon) {
        String oldWeapon = this.weapon;
        setWeapon(newWeapon);
        return String.format("HERO: %s has dropped Weapon %s and picked-up %s%n", this.name, oldWeapon, this.weapon);
    }

    public String updateSecondary(String newSecondary) {
        String oldSecondary = this.secondary;
        setSecondary(newSecondary);
        return String.format("HERO: %s has dropped Secondary %s and picked-up %s%n", this.name, oldSecondary, this.secondary);
    }

    public String updateArmor(String newArmor) {
        String oldArmor = this.armor;
        setArmor(newArmor);
        return String.format("HERO: %s has dropped Armor %s and picked-up %s%n", this.name, oldArmor, this.armor);
    }
}

    // // Main method for testing
    // public static void main(String[] args) {
    //     character character = new character("Steve", 0, "Sword", "Shield", "Leather Armor");

    //     // Test getters
    //     System.out.println("name: " + character.getName());
    //     System.out.println("level: " + character.getLevel());
    //     System.out.println("Weapon: " + character.getWeapon());
    //     System.out.println("Secondary: " + character.getSecondary());
    //     System.out.println("Armor: " + character.getArmor());

    //     // Test update methods
    //     character.levelUp();
    //     character.updateWeapon("Axe");
    //     character.updateSecondary("Bow");
    //     character.updateArmor("Chainmail Armor");

    //     // Test getters after update
    //     System.out.println("name: " + character.getName());
    //     System.out.println("Updated level: " + character.getLevel());
    //     System.out.println("Updated Weapon: " + character.getWeapon());
    //     System.out.println("Updated Secondary: " + character.getSecondary());
    //     System.out.println("Updated Armor: " + character.getArmor());
    // }
    //}