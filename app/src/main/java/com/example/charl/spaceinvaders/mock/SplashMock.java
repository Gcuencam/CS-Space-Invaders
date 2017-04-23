package com.example.charl.spaceinvaders.mock;

/**
 * Created by josegarben on 22/4/17.
 */


public class SplashMock {
    public boolean isUserInApp;
    public boolean isUserInInicioActivity;
    public boolean isOptionButtonPressed;
    public boolean isPlayButtonPressed;
    public String[] optionMenu = {"Fondo de juego", "Skin aliada", "Skin enemiga"};

    public SplashMock() {
        this.isUserInApp = true;
        this.isUserInInicioActivity = true;
        this.isOptionButtonPressed = false;
        this.isPlayButtonPressed = false;

    }

    public String clickOption() {
        this.isOptionButtonPressed = true;
        return "Option button successfully clicked";
    }
    public String clickPlay() {
        this.isPlayButtonPressed = true;
        return "Screen successfully pressed";
    }

    @Override
    public String toString() {
        return this.optionMenu[0] + " | " + this.optionMenu[1] + " | " + this.optionMenu[2];
    }





}
