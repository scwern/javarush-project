package com.javarush.games.game2048;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {

        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
               // setCellColor(i, j, Color.ORANGE);
                setCellColoredNumber(i,j,gameField[j][i]);
            }

        }

    }

    private void createNewNumber() {
        boolean isCreated = false;
        do {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[y][x] == 0) {
                gameField[y][x] = getRandomNumber(10) < 9 ? 2 : 4;
                isCreated = true;
            }
        }
        while (!isCreated);
    }
    private Color getColorByValue(int value){
        switch (value){
            case 0 :
                return Color.WHITE;
            case 2:
                return Color.GREEN;
            case 4:
                return Color.AZURE;
            case 8:
                return Color.BLUE;
            case 16:
                return Color.CORAL;
            case 32:
                return Color.CADETBLUE;
            case 64:
                return Color.DARKBLUE;
            case 128:
                return Color.DARKORCHID;
            case 256:
                return Color.GOLD;
            case 512:
                return Color.KHAKI;
            case 1024:
                return Color.LIGHTSKYBLUE;
            case 2056:
                return Color.ORCHID;
            default: return Color.NONE;

        }
    }
    private void setCellColoredNumber(int x, int y, int value){
        Color color = getColorByValue(value);
        String str = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, str);
    }
    private boolean compressRow(int[] row){

    }

}


