package ua.logos.model;

import ua.logos.service.Coach;

public class FootbalCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Trener po futbolu: Bigayte protyagom 1god";
    }

    @Override
    public String getDailyFortune() {
        return "Trener po futbolu: Sjogodni tviy shaslyvyj den";
    }
}
