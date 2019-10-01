/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp4;

import bowling.MultiPlayerGame;
import bowling.SinglePlayerGame;
import java.util.ArrayList;

/**
 *
 * @author pedago
 */
public class MultiBowling implements MultiPlayerGame {
    
    String[] players;
    SinglePlayerGame games;
    ArrayList<Player> p;
    
    @Override
    public String startNewGame(String[] playerName) throws Exception {
        for (int i = 0;i<playerName.length;i++){
            Player x = new Player(playerName[i]);
            p.add(x);
        }
        return "Prochain tir :  ";
        
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        for (int i = 0 ; i<p.size() ; i++){
            if (p.get(i).name == playerName){
                return p.get(i).score();
            }
        }
        throw new Exception("Ce joueur n'existe pas");
    }
    
}
