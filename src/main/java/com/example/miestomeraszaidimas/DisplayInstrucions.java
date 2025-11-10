package com.example.miestomeraszaidimas;

public class DisplayInstrucions {

    public static void startGame() {
        System.out.println("Tavo tikslas – išlaikyti miestą 10 raundų,");
        System.out.println("nebankrutavus ir nepraradus gyventojų pasitikėjimo.\n");
    }
    public static void stats(City city) {
        System.out.println("Gyventoju skaicius:" + City.getPopulations());
        System.out.println("Tavo pinigu likutis:" + City.getBudget()+ "$");
        System.out.println("Gyventoju laimes rodiklis: " + City.getHappiness());
        System.out.println("Gyventoju saugumo rodiklis: " + City.getSafety());
        System.out.println("Mokesčiai: "+City.getTax()+"%");
    }
    public static void userDecisions() {
        System.out.println("////////////////////////////////////////");
        System.out.println("1 ->Statyti papildomus pastatus (-50$)");
        System.out.println("2 ->Keliu taisymai (-80$)");
        System.out.println("3 ->Didinti saugumą mieste, mažinti įvykiu skaičiu (-150$)");
        System.out.println("4 ->Statyti daugiau parku (-110$)");
        System.out.println("5 ->Nedaryti Nieko");
        System.out.println("////////////////////////////////////////");
    }
    public static void userDecisionsTax() {
        System.out.println("////////////////////////////////////////");
        System.out.println("1 ->Mažinti mokesčius -10%");
        System.out.println("2 ->Didinti mokesčius +10%");
        System.out.println("////////////////////////////////////////");
    }
    public static void showLost() {
        System.out.println("Miestas žlugo! Pralaimėjai žaidimą.");
    }
    public static void showWin() {
        System.out.println("Miestas išgyveno , Tu Laimėjai!!");
    }
    public static void showEvent(Event event) {
        System.out.println("Tavo mieste:"+ event.getDescription());
    }
    public static void taxesGain(City city) {
        System.out.println("\n⚠️ Iš gyventojų mokesčių papildomai prie biudgeto gavai:" + 2000/(100-City.getTax())+"$");
    }
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
    public static void allert() {
        System.out.println("Tave mieste zmonės jaučiasi nesaugiai ir palieka miesta!!!");
    }

}
