package com.example.snackandladder;


import static com.example.snackandladder.SnakeNLadder.WINPOINT;
import static com.example.snackandladder.SnakeNLadder.snake;

public class calculateplayervalue {
    public int calculatePlayerValue(int player, int diceValue) {
        player = player + diceValue;

        if (player > WINPOINT) {
            player = player - diceValue;
            return player;
        }

        if (null != snake.get(player)) {
            System.out.println("swallowed by snake");
            player = snake.get(player);
        }

        if (null != ladder.get(player)) {
            System.out.println("climb up the ladder");
            player = ladder.get(player);
        }
        return player;
    }
}