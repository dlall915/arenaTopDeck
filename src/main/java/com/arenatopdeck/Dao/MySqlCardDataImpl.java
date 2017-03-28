package com.arenatopdeck.Dao;

import com.arenatopdeck.Entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * Created by David on 3/28/2017.
 */
@Repository
@Qualifier("mysql")
public class MySqlCardDataImpl implements CardDao {

    private static class CardRowMapper implements RowMapper<Card> {

        @Override
        public Card mapRow(ResultSet resultSet, int i) throws SQLException {
            Card card = new Card();
            card.setName(resultSet.getString("name"));
            card.setClass_(resultSet.getString("class"));
            card.setMana(resultSet.getInt("mana"));
            card.setType(resultSet.getString("type"));
            card.setRarity(resultSet.getString("rarity"));
            card.setSet(resultSet.getString("set_name"));
            return card;
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Collection<Card> getAllCards() {
        //SELECT column_name(s) FROM table_name
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck";
        List<Card> cards = jdbcTemplate.query(sql, new CardRowMapper());
        return cards;
    }

    @Override
    public Card getCardByName(String name) {
        //SELECT column_name(s) FROM table_name WHERE column_name operator value
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck WHERE name = ?";
        Card card = jdbcTemplate.queryForObject(sql, new CardRowMapper(), name);
        return card;
    }

    @Override
    public Collection<Card> getCardsByClass(String class_) {
        //SELECT column_name(s) FROM table_name WHERE column_name operator value
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck WHERE class = ?";
        List<Card> cards = jdbcTemplate.query(sql, new CardRowMapper(), class_);
        return cards;
    }

    @Override
    public Collection<Card> getCardsByMana(int mana) {
        //SELECT column_name(s) FROM table_name WHERE column_name operator value
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck WHERE mana = ?";
        List<Card> cards = jdbcTemplate.query(sql, new CardRowMapper(), mana);
        return cards;
    }

    @Override
    public Collection<Card> getCardsByType(String type) {
        //SELECT column_name(s) FROM table_name WHERE column_name operator value
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck WHERE type = ?";
        List<Card> cards = jdbcTemplate.query(sql, new CardRowMapper(), type);
        return cards;
    }

    @Override
    public Collection<Card> getCardsByRarity(String rarity) {
        //SELECT column_name(s) FROM table_name WHERE column_name operator value
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck WHERE rarity = ?";
        List<Card> cards = jdbcTemplate.query(sql, new CardRowMapper(), rarity);
        return cards;
    }

    @Override
    public Collection<Card> getCardsBySet(String set) {
        //SELECT column_name(s) FROM table_name WHERE column_name operator value
        final String sql = "SELECT name, class, mana, type, rarity, set_name FROM arenatopdeck WHERE set_name = ?";
        List<Card> cards = jdbcTemplate.query(sql, new CardRowMapper(), set);
        return cards;
    }

}
