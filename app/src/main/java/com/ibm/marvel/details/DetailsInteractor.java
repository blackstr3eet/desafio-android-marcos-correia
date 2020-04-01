package com.ibm.marvel.details;

interface DetailsInteractorInput {
    void fetchDetailsMetaData();
}

public class DetailsInteractor implements DetailsInteractorInput {

    protected DetailsPresenterInput presenterInput;

    @Override
    public void fetchDetailsMetaData() {
        presenterInput.presentDetailsMetaData();
    }
}