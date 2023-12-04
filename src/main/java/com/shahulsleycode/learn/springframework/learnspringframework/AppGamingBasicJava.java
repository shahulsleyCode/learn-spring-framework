package com.shahulsleycode.learn.springframework.learnspringframework;

import com.shahulsleycode.learn.springframework.games.GameRunner;
//import com.shahulsleycode.learn.springframework.games.MarioGame;
import com.shahulsleycode.learn.springframework.games.SuperContraGame;

public class AppGamingBasicJava {
    
    public static void main(String[] args){
        
        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }

}