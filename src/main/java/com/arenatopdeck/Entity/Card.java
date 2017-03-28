package com.arenatopdeck.Entity;

/**
 * Created by David on 3/28/2017.
 */
public class Card {

    private String name;
    private String class_;
    private int mana;
    private String type;
    private String rarity;
    private String set;

    public Card(String name, String class_, int mana, String type, String rarity, String set) {
        this.name = name;
        this.class_ = class_;
        this.mana = mana;
        this.type = type;
        this.rarity = rarity;
        this.set = set;
    }

    public Card() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

}
