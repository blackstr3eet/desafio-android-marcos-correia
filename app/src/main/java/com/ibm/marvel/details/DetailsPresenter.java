package com.ibm.marvel.details;

import java.lang.ref.WeakReference;

interface DetailsPresenterInput {
    void presentDetailsMetaData();
}

public class DetailsPresenter implements DetailsPresenterInput {

    protected WeakReference<DetailsActivityInput> activityInput;

    @Override
    public void presentDetailsMetaData() {
        activityInput.get().displayDetailsData(null);
    }
}