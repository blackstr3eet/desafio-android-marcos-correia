package com.ibm.marvel.characters;

import java.lang.ref.WeakReference;

interface CharactersRouterInput {
    void callScreen();
}

public class CharactersRouter implements CharactersRouterInput {

    protected WeakReference<CharactersActivity> activity;

    @Override
    public void callScreen() {

    }
}