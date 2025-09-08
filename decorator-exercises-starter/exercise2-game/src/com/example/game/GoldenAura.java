package com.example.game;

public class GoldenAura extends CharacterDecorator {
    private final String auraSprite = "golden_aura.png";
    private final int speedBuff = 1;
    private final int damageBuff = 2;

    public GoldenAura(Character inner) {
        super(inner);
    }

    @Override
    public String getSprite() {
        return auraSprite;
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed() + speedBuff;
    }

    @Override
    public int getDamage() {
        return inner.getDamage() + damageBuff;
    }

    @Override
    public void move() {
        System.out.println("[GoldenAura] Aura shimmering...");
        super.move();
    }

    @Override
    public void attack() {
        System.out.println("[GoldenAura] Radiant strike!");
        super.attack();
    }
}


