package ua.logos.model;

import ua.logos.App;
import ua.logos.service.Coach;
import ua.logos.service.FortuneService;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Trener po tenisu: Vidpracyovujte podachi protyagom 40hv";
    }

    @Override
    public String getDailyFortune() {
        return "Trener po tenisu: "+fortuneService.getFortune();
    }
}
