package com.example.miestomeraszaidimas;

import java.util.Random;
public class RandomEvent {
    public static Event eventRandom(City city) {
        Random random = new Random();
        int id = random.nextInt(5);

        return switch (id) {
            case 0 -> new Event("Gaisras🔥", -10, -50, -20, -10, +5);
            case 1 -> new Event("Protestas prieš valdžią ⚠️", -15, -20, 0, -5, +20);
            case 2 -> new Event("Ekonomikos pakilimas 💰", +10, +100, +30, 0, -15);
            case 3 -> new Event("!!! Žemės drebėjimas !!!",-20,-100,-50,-15,-5);
            case 4 -> new Event("Europos parlamento apsilankymas",+10,+200,+25,+15,0);
            default -> new Event("Rami diena 🌤️", 0, 0, 0, 0, 0);
        };
        //city.applyDecision(decision);
    }
}

