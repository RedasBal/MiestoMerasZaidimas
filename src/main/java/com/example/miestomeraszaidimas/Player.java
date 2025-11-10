package com.example.miestomeraszaidimas;
import java.util.Random;
import java.util.Scanner;

import static com.example.miestomeraszaidimas.RandomEvent.eventRandom;
import static java.lang.Thread.sleep;

public class Player{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        City city = new City(1000,500,50,50,20);
        DisplayInstrucions.startGame();
        int turns=1;
        while(turns<=10)
        {
            System.out.println("Round:"+turns+"\n");
            DisplayInstrucions.stats(city);
            GameDecisions decision;
            DisplayInstrucions.userDecisions();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> decision = new GameDecisions( -50, +10, 0, +25,0);
                case 2 -> decision = new GameDecisions( -80, +10, +5, +5,0);
                case 3 -> decision = new GameDecisions( -150, +12, +15, +35,0);
                case 4 -> decision = new GameDecisions( -110, +15, +5,+80 ,0);
                case 5 -> decision = new GameDecisions( +100, -10, 0, -50,0);
                default -> {
                    System.out.println("Neteisingas pasirinkimas, praleistas turas!");
                    decision = new GameDecisions( 0, 0, 0, 0,0);
                }
            }
            city.applyDecision(decision);
            System.out.println("Ar nori didinti/mazinti mokescius? (yes/no):");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("yes"))
                TaxChange.taxCorrenction(city);

            int random = new Random().nextInt(100);
            if (random < 30) {
                Event event = eventRandom(city);
                DisplayInstrucions.showEvent(event);
                event.apply(city);
            }
            if(city.getHappiness()<=30|| city.getSafety()<=30 ){
                DisplayInstrucions.allert();
            }

            if(city.getHappiness()<=0 || city.getSafety()<=0 || city.getBudget()<=0) {
                DisplayInstrucions.showLost();
                return;
            }
            DisplayInstrucions.taxesGain(city);
            turns++;
            sleep(4500);
            DisplayInstrucions.clearConsole();
            System.out.println("Round: " + turns + "\n");
        }
        DisplayInstrucions.clearConsole();
        DisplayInstrucions.showWin();
    }
}


