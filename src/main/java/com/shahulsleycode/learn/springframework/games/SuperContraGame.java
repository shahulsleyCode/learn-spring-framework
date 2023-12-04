package com.shahulsleycode.learn.springframework.games;

public class SuperContraGame implements GameConsole{
    public void up() {
        System.out.println(this. getClass().getSimpleName() + " - UP");
    }
    public void down() {
        System.out.println(this. getClass().getSimpleName() + " - DOWN");
    }
    public void right() {
        System.out.println(this. getClass().getSimpleName() + " - RIGHT");
    }
    public void left() {
        System.out.println(this. getClass().getSimpleName() + " - UP");
    }
}
