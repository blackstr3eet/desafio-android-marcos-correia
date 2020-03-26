package com.ibm.marvel.details;

import com.ibm.marvel.details.DetailsModel.DetailsResponse;
import java.lang.ref.WeakReference;

interface DetailsPresenterInput {
    void presentDetailsMetaData(DetailsResponse response);
}

public class DetailsPresenter implements DetailsPresenterInput {

    protected WeakReference<DetailsActivityInput> activityInput;

    @Override
    public void presentDetailsMetaData(DetailsResponse response) {

    }
}