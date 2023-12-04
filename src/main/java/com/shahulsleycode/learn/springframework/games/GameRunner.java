package com.shahulsleycode.learn.springframework.games;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    
    //private MarioGame game;
    //private SuperContraGame game;
    private GameConsole game;
    
    //public GameRunner(MarioGame game){
    //public GameRunner(SuperContraGame game){
    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
