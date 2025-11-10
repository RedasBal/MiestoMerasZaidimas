package com.example.miestomeraszaidimas;

public class GameDecisions
{
   // protected String decision;
    protected int budgetChange;
    protected int happinessChange;
    protected int safetyChange;
    protected int populationChange;
    protected int taxChange;

    public GameDecisions( int budgetChange, int happinessChange, int safetyChange, int populationChange, int taxChange )
    {
      //  this.decision = decision;
        this.budgetChange = budgetChange;
        this.happinessChange = happinessChange;
        this.safetyChange = safetyChange;
        this.populationChange = populationChange;
        this.taxChange = taxChange;
    }
    public int getBudgetChange()
    {
        return budgetChange;
    }
    public int getHappinessChange()
    {
        return happinessChange;
    }
    public int getSafetyChange()
    {
        return safetyChange;
    }
    public int getPopulationChange()
    {
        return populationChange;
    }
    public int getTaxChange()
    {
        return taxChange;
    }
}
