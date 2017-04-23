package com.example.charl.spaceinvaders.mock;

/**
 * Created by josegarben on 22/4/17.
 */
public class GameActivityMock {

    public boolean isUserInMainActivity;
    public boolean isOptionButtonPressed;
    public boolean isRightButtonClicked, isLeftButtonClicked, isMiddleButtonClicked;
    public int heigh, weight;

    public int[] playerShip = {200, 150};
    public int[] ammo = {-1};

    public GameActivityMock() {
        this.heigh = 200;
        this.weight = 300;
        this.isUserInMainActivity = true;
        this.isRightButtonClicked = false;
        this.isLeftButtonClicked = false;
        this.isOptionButtonPressed = false;

    }

    @Override
    public String toString() {
        return "Alto: " + this.heigh + "\nAncho: " + this.weight + "\nPosicion: " + this.toString2()+"\n";
    }
    public String clickOption() {
        this.isOptionButtonPressed = true;
        return "Option button successfully clicked";
    }

    public boolean pressRightInScreen() {
        this.isRightButtonClicked = true;
        return this.isRightButtonClicked;
    }

    public String moveSpaceToLeft() {
        this.playerShip[1] = 149;
        return "Player's ship has been moved to " + this.toString2();
    }

    public boolean pressLefttInScreen() {
        this.isLeftButtonClicked = true;
        return this.isLeftButtonClicked;
    }

    public String moveSpaceToRight() {
        this.playerShip[1] = 151;
        return "Player's ship has been moved to " + this.toString2();
    }

    public boolean pressMiddleButton() {
        this.isMiddleButtonClicked = true;
        return this.isMiddleButtonClicked;
    }

    public String releaseAmmo() {
        this.ammo[0] = 100;
        return "Player's ship is shooting.";
    }

    private String toString2() {
        return this.playerShip[0] + "," + this.playerShip[1];
    }

}

