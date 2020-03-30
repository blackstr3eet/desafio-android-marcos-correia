package com.ibm.marvel.characters;

import com.ibm.marvel.characters.CharactersModel.CharactersResponse;
import java.lang.ref.WeakReference;

interface CharactersPresenterInput {
    void presentCharactersMetaData(CharactersResponse response);
}

public class CharactersPresenter implements CharactersPresenterInput {

    protected WeakReference<CharactersActivityInput> activityInput;

    @Override
    public void presentCharactersMetaData(CharactersResponse response) {

    }
}