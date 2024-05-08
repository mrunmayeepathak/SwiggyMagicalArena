package com.magicarena.model;

public class Player {

   private int health;
   private int strength;
   private int attack;

   private String playerName;


   public Player(int health, int strength, int attack , String playerName)
   {
       this.attack = attack;
       this.health = health;
       this.strength = strength;
       this.playerName = playerName;

   }


    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean isAlive()
    {
        return this.health > 0;
    }
}
