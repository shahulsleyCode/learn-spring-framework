package com.shahulsleycode.learn.springframework.games;

public class GameRunner {
    
    private MarioGame game;

    public GameRunner(MarioGame game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
