package com.ibm.marvel.comics;

import java.lang.ref.WeakReference;

interface ComicsPresenterInput {
    void presentComicsMetaData();
}

public class ComicsPresenter implements ComicsPresenterInput {

    protected WeakReference<ComicsActivityInput> activityInput;

    @Override
    public void presentComicsMetaData() {
        activityInput.get().displayComicsData(null);
    }
}