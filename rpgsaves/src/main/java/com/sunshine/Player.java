package com.sunshine;

import java.util.ArrayList;
import java.util.List;

import com.sunshine.Player.JobType;
import com.sunshine.Player.Spell;

public class Player extends Character {
    // Enum for JobType
    public enum JobType {
        FIGHTER, CLERIC, RANGER
    }

    // Properties
    private JobType jobType;
    private SpellSlot spellSlot;

    // Nested class to represent a Spell
    public class Spell {
        private String name;
        private int damage;
        private int cost;
        private int effect;

        public Spell(String name, int damage, int cost, int effect) {
            this.name = name;
            this.damage = damage;
            this.cost = cost;
            this.effect = effect;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }

        public int getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return String.format("Casts %s; DMG/COST/EFF: %d/%d/%d.%n", name, damage, cost, effect);
        }
    }

    // SpellSlot Class to Store Spells
    public class SpellSlot {
        private List<Spell> spells;

        public SpellSlot() {
            spells = new ArrayList<>();
        }

        public void addSpell(String name, int damage, int cost, int effect) {
            spells.add(new Spell(name, damage, cost, effect));
        }

        public List<Spell> getSpells() {
            return spells;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Spell spell : spells) {
                sb.append(spell.toString()).append("\n");
            }
            return sb.toString().trim();
        }
    }

    // Constructor
    public Player(String name, Integer level, String weapon, String secondary, String armor, int health, int mana, JobType jobType) {
        super(name, level, weapon, secondary, armor, health, mana);
        this.jobType = jobType;
        this.spellSlot = new SpellSlot();
        defaultJobSpells(jobType);
    }

    // Default Constructor
    public Player() {}

    // GETTER
    public JobType getJobType() {
        return jobType;
    }

    // GETTER for SpellSlot
    public SpellSlot getSpellSlot() {
        return spellSlot;
    }

    // SETTER
    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    // Initialize Spells Based on Job Type
    private void defaultJobSpells(JobType jobType) {
        switch (jobType) {
            case FIGHTER:
                spellSlot.addSpell("Heavy Smash", 30, 10, 0);
                spellSlot.addSpell("Defensive Stance", 0, 10, 30);
                break;
            case CLERIC:
                spellSlot.addSpell("Holy Light", 0, 10, 20);
                spellSlot.addSpell("Searing Bolt", 20, 5, 10);
                break;
            case RANGER:
                spellSlot.addSpell("Triple Shot", 40, 20, 0);
                spellSlot.addSpell("Double Step", 0, 20, 20);
                break;
            default:
                spellSlot.addSpell("Throw Rock", 5, 5, 5);
                break;
        }
    }

    public String jobChange() {
        super.levelUp();
        return String.format("Your job type has changed to %s.%n", this.jobType);
    }
}

