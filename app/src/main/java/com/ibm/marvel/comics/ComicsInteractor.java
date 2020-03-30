package com.ibm.marvel.comics;

import static com.ibm.marvel.comics.ComicsModel.*;

interface ComicsInteractorInput {
    void fetchComicsMetaData(ComicsRequest request);
}

public class ComicsInteractor implements ComicsInteractorInput {

    protected ComicsPresenterInput presenterInput;

    @Override
    public void fetchComicsMetaData(ComicsRequest request) {

    }
}