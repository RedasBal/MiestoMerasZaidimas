package com.example.miestomeraszaidimas;

public class Event {
    protected String description;
    protected int happinessChange;
    protected int budgetChange;
    protected int populationChange;
    protected int safetyChange;
    protected int taxChange;

    public Event(String description, int happinessChange, int budgetChange, int populationChange,  int safetyChange , int taxChange) {
       this.description = description;
        this.happinessChange = happinessChange;
        this.budgetChange = budgetChange;
        this.populationChange = populationChange;
        this.safetyChange = safetyChange;
        this.taxChange = taxChange;
    }
    public String getDescription() {
        return description;
    }
    public void apply(City city) {
        City.applyDecision(new GameDecisions(budgetChange,happinessChange,happinessChange,safetyChange,taxChange));
    }

}

