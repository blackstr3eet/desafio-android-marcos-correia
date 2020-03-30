package com.ibm.marvel.comics;

import com.ibm.marvel.comics.ComicsModel.ComicsResponse;
import java.lang.ref.WeakReference;

interface ComicsPresenterInput {
    void presentComicsMetaData(ComicsResponse response);
}

public class ComicsPresenter implements ComicsPresenterInput {

    protected WeakReference<ComicsActivityInput> activityInput;

    @Override
    public void presentComicsMetaData(ComicsResponse response) {

    }
}