package com.shahulsleycode.learn.springframework.learnspringframework;

import com.shahulsleycode.learn.springframework.games.GameRunner;
import com.shahulsleycode.learn.springframework.games.PacManGame;
//import com.shahulsleycode.learn.springframework.games.MarioGame;
//import com.shahulsleycode.learn.springframework.games.SuperContraGame;

public class AppGamingBasicJava {
    
    public static void main(String[] args){
        
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }

}