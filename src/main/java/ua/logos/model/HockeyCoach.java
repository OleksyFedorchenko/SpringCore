package ua.logos.model;

import ua.logos.service.Coach;
import ua.logos.service.FortuneService;

public class HockeyCoach implements Coach {
    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Trener po hockeu: Katajsja protyagom 2god";
    }

    @Override
    public String getDailyFortune() {
        return "Trener po hockeu: "+fortuneService.getFortune();
    }
}
