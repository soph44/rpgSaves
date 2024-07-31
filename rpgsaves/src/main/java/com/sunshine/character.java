package com.sunshine;

/**
 * Hello world!
 *
 */
public class character {
    // Properties
    private String name;
    private Integer level;
    private String weapon;
    private String secondary;
    private String armor;

    // Constructor
    public character(String name, Integer level, String weapon, String secondary, String armor) {
        this.name = name;
        this.level = level;
        this.weapon = weapon;
        this.secondary = secondary;
        this.armor = armor;

    }

    // Default Constructor
    public character() {}

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

    // METHODS
    public void levelUp() {
        setLevel(this.level + 1);
        System.out.printf("HERO: %s has LEVELED-UP to LVL %d", this.name, this.level);
    }

    public void updateWeapon(String newWeapon) {
        String oldWeapon = this.weapon;
        setWeapon(newWeapon);
        System.out.printf("HERO: %s has dropped Weapon %s and picked-up %s", this.name, oldWeapon, this.weapon);
    }

    public void updateSecondary(String newSecondary) {
        String oldSecondary = this.secondary;
        setSecondary(newSecondary);
        System.out.printf("HERO: %s has dropped Secondary %s and picked-up %s", this.name, oldSecondary, this.secondary);
    }

    public void updateArmor(String newArmor) {
        String oldArmor = this.armor;
        setArmor(newArmor);
        System.out.printf("HERO: %s has dropped Armor %s and picked-up %s", this.name, oldArmor, this.armor);
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
}