package com.ibm.marvel.comics;

interface ComicsInteractorInput {
    void fetchComicsMetaData();
}

public class ComicsInteractor implements ComicsInteractorInput {

    protected ComicsPresenterInput presenterInput;

    @Override
    public void fetchComicsMetaData() {
        presenterInput.presentComicsMetaData();
    }
}