package ua.logos.service.impl;

import ua.logos.service.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Sjogodni tviy shaslyvyj den";
    }
}
