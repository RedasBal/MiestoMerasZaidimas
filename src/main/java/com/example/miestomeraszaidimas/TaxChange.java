package com.example.miestomeraszaidimas;
import java.util.Scanner;
public class TaxChange {

    public static void taxCorrenction(City city) {
        Scanner scanner = new Scanner(System.in);
        GameDecisions decision;
        DisplayInstrucions.userDecisionsTax();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> decision = new GameDecisions( -70, +10, 0, +20,-10);
            case 2 -> decision = new GameDecisions( +10, -20, -5, -20,+10);
            default -> {
                System.out.println("Neteisingas pasirinkimas, praleistas turas!");
                decision = new GameDecisions( 0, 0, 0, 0,0);
            }
        }
        city.applyDecision(decision);

    }
}
