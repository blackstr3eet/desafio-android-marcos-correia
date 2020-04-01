package com.ibm.marvel.characters;

import java.lang.ref.WeakReference;

interface CharactersPresenterInput {
    void presentCharactersMetaData();
}

public class CharactersPresenter implements CharactersPresenterInput {

    protected WeakReference<CharactersActivityInput> activityInput;

    @Override
    public void presentCharactersMetaData() {
        activityInput.get().displayCharactersData(null);
    }
}