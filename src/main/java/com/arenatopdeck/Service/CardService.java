package com.arenatopdeck.Service;

import com.arenatopdeck.Dao.CardDao;
import com.arenatopdeck.Entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by David on 3/28/2017.
 */
@Service
public class CardService {

    @Autowired
    @Qualifier("mysql")
    private CardDao cardDao;

    public Collection<Card> getAllCards() { return this.cardDao.getAllCards(); }

    public Card getCardByName(String name) {
        return this.cardDao.getCardByName(name);
    }

    public Collection<Card> getCardsByClass(String class_) {
        return this.cardDao.getCardsByClass(class_);
    }

    public Collection<Card> getCardsByMana(int mana) {
        return this.cardDao.getCardsByMana(mana);
    }

    public Collection<Card> getCardsByType(String type) {
        return this.cardDao.getCardsByType(type);
    }

    public Collection<Card> getCardsByRarity(String rarity) {
        return this.cardDao.getCardsByRarity(rarity);
    }

    public Collection<Card> getCardsBySet(String set) {
        return this.cardDao.getCardsBySet(set);
    }

}
