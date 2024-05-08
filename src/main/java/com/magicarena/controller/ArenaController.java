package com.magicarena.controller;

import com.magicarena.service.GameService;
import com.magicarena.model.Player;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class ArenaController {

    private GameService gameservice = new GameService();


    private Player playerA;
    private Player playerB;
    private GameService gameService;

    public ArenaController(Player playerA, Player playerB)
    {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startfight()
    {
        //System.out.println(playerA.getHealth());
        //System.out.println(playerB.getHealth());

        Player attacker = playerA.getHealth()<=playerB.getHealth()?playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;


        while(playerA.isAlive()&&playerB.isAlive())
        {
            System.out.println();
            System.out.println( attacker.getPlayerName() + " is attacking...");
            gameservice.performAttack(attacker, defender);

            if(!playerA.isAlive() || !playerB.isAlive())
            {
                System.out.println("Game Over");
                System.out.println((playerA.isAlive()? playerA.getPlayerName() : playerB.getPlayerName())+" wins!!");
                break;
            }
            Player temp = attacker;
            attacker = defender;
            defender = temp;

        }
    }


    public GameService getGameservice() {
        return gameservice;
    }

    public void setGameservice(GameService gameservice) {
        this.gameservice = gameservice;
    }
}
