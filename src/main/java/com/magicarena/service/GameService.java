package com.magicarena.service;
import com.magicarena.model.Player;
import com.magicarena.model.Dice;

public class GameService {
    public void performAttack(Player attacker, Player defender)
    {
        int attackRoll = Dice.roll();
        int defendRoll = Dice.roll();



        System.out.println("Attacker's dice roll : " + attackRoll);
        System.out.println("Defender's dice roll : " + defendRoll);
        System.out.println();

        int attackDamage = attacker.getAttack()*attackRoll;
        int defendPower = defender.getStrength()*defendRoll;

        int maxAttack = attacker.getAttack()*6;
        int minDamage = defender.getStrength()*1;


        int DamageDealt = Math.max(0, attackDamage-defendPower);
        defender.setHealth(defender.getHealth()-DamageDealt);
        System.out.println("Attack Damage : "+attackDamage + " | Defence: " + defendPower+" | Health Reduced: "+DamageDealt+" | Remaining Health: "+ defender.getHealth());
        System.out.println();
    }

}
