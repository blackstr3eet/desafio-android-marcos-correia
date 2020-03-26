package com.ibm.marvel.details;

import com.ibm.marvel.details.DetailsModel.DetailsRequest;

interface DetailsInteractorInput {
    void fetchDetailsMetaData(DetailsRequest request);
}

public class DetailsInteractor implements DetailsInteractorInput {

    protected DetailsPresenterInput presenterInput;

    @Override
    public void fetchDetailsMetaData(DetailsRequest request) {

    }
}