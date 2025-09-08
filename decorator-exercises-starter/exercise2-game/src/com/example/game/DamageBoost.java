package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private final int bonus;

    public DamageBoost(Character inner, int bonus) {
        super(inner);
        this.bonus = bonus;
    }

    @Override
    public int getDamage() {
        return Math.max(0, inner.getDamage() + bonus);
    }
}


