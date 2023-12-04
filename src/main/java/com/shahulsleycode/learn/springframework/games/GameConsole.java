package com.shahulsleycode.learn.springframework.games;

import org.springframework.stereotype.Component;

@Component
public interface GameConsole {
    void up();
    void down();
    void right();
    void left();
}
