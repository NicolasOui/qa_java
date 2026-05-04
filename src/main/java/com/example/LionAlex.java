package com.example;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        List<String> AlexFriends = List.of("Марти", "Глория", "Мелман");
        return AlexFriends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
