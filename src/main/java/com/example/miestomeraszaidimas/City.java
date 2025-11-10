package com.example.miestomeraszaidimas;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class City {
    protected static int populations;
    protected static int budget;
    protected static int happiness;
    protected static int safety;
    protected static int tax;

    public City(int populations, int budget, int happiness, int safety, int tax) {
        this.populations = populations;
        this.budget = budget;
        this.happiness = happiness;
        this.safety = safety;
        this.tax = tax;
    }
    public static void applyDecision(GameDecisions gameDecision)
    {
        budget+=gameDecision.getBudgetChange()+ 2000/(100-tax);
        happiness+=gameDecision.getHappinessChange();
        safety+=gameDecision.getSafetyChange();
        populations+=gameDecision.getPopulationChange();
        tax+=gameDecision.getTaxChange();
    }

    public static int getPopulations() {
        return populations;
    }

    public static int getBudget() {
        return budget;
    }

    public static int getHappiness() {
        return happiness;
    }

    public static int getSafety() {
        return safety;
    }
    public static int getTax() {
        return tax;
    }
}

