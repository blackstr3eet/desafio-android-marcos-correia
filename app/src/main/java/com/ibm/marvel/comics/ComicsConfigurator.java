package com.ibm.marvel.comics;

import java.lang.ref.WeakReference;

public enum ComicsConfigurator {
    INSTANCE;

    protected void configure(ComicsActivity activity) {

        ComicsPresenter presenter = new ComicsPresenter();
        presenter.activityInput = new WeakReference<>(activity);

        ComicsInteractor interactor = new ComicsInteractor();
        interactor.presenterInput = presenter;

        if (activity.interactor == null) {
            activity.interactor = interactor;
        }
    }
}