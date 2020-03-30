package com.ibm.marvel.characters;

import com.ibm.marvel.characters.CharactersModel.CharactersRequest;

interface CharactersInteractorInput {
    void fetchCharactersMetaData(CharactersRequest request);
}

public class CharactersInteractor implements CharactersInteractorInput {

    protected CharactersPresenterInput presenterInput;

    @Override
    public void fetchCharactersMetaData(CharactersRequest request) {

    }
}