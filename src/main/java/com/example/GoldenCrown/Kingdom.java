package com.example.GoldenCrown;

public enum Kingdom {

    SPACE("gorilla"),
    LAND("Panda"),
    WATER("Octopus"),
    ICE("Mammoth"),
    AIR("Owl"),
    FIRE("Dragon");

    Kingdom(String emblem) {
        this.emblem = emblem;
    }

    private String emblem;

    public String getEmblem() {
        return emblem;
    }

    public static Kingdom getKingdom(String text) {
        return Kingdom.valueOf(text.toUpperCase());
    }
}
