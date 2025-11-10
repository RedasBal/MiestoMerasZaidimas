package com.example.miestomeraszaidimas;

public class Game {
    private String name;
    private String city_name;

    public Game(String name, String city_name) {
        this.name = name;
        this.city_name = city_name;
    }
    public void doAction(GameDecisions gameDecisions)
    {
        City.applyDecision(gameDecisions);
    }
}
