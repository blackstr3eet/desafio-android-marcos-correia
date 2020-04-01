package com.ibm.marvel.characters;

interface CharactersInteractorInput {
    void fetchCharactersMetaData();
}

public class CharactersInteractor implements CharactersInteractorInput {

    protected CharactersPresenterInput presenterInput;

    @Override
    public void fetchCharactersMetaData() {
        presenterInput.presentCharactersMetaData();
    }
}