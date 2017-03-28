package com.arenatopdeck.Dao;

import com.arenatopdeck.Entity.Card;

import java.util.Collection;

/**
 * Created by David on 3/28/2017.
 */
public interface CardDao {
    Collection<Card> getAllCards();

    Card getCardByName(String name);

    Collection<Card> getCardsByClass(String class_);

    Collection<Card> getCardsByMana(int mana);

    Collection<Card> getCardsByType(String type);

    Collection<Card> getCardsByRarity(String rarity);

    Collection<Card> getCardsBySet(String set);

}