package com.arenatopdeck.Controller;

import com.arenatopdeck.Entity.Card;
import com.arenatopdeck.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by David on 3/28/2017.
 */
@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Card> getAllCards() { return this.cardService.getAllCards(); }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Card getCardByName(@PathVariable("name") String name) {
        return this.cardService.getCardByName(name);
    }

    @RequestMapping(value = "/class/{class}", method = RequestMethod.GET)
    public Collection<Card> getCardsByClass(@PathVariable("class") String class_) {
        return this.cardService.getCardsByClass(class_);
    }

    @RequestMapping(value = "/mana/{mana}", method = RequestMethod.GET)
    public Collection<Card> getCardsByMana(@PathVariable("mana") int mana) {
        return this.cardService.getCardsByMana(mana);
    }

    @RequestMapping(value = "/type/{type}", method = RequestMethod.GET)
    public Collection<Card> getCardsByType(@PathVariable("type") String type) {
        return this.cardService.getCardsByType(type);
    }

    @RequestMapping(value = "/rarity/{rarity}", method = RequestMethod.GET)
    public Collection<Card> getCardsByRarity(@PathVariable("rarity") String rarity) {
        return this.cardService.getCardsByRarity(rarity);
    }

    @RequestMapping(value = "/set/{set}", method = RequestMethod.GET)
    public Collection<Card> getCardsBySet(@PathVariable("set") String set) {
        return this.cardService.getCardsBySet(set);
    }

}
