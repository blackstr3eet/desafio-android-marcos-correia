package com.ibm.marvel.details;

import java.lang.ref.WeakReference;

public enum DetailsConfigurator {
    INSTANCE;

    protected void configure(DetailsActivity activity){

        DetailsRouter router = new DetailsRouter();
        router.activity = new WeakReference<>(activity);

        DetailsPresenter presenter = new DetailsPresenter();
        presenter.activityInput = new WeakReference<>(activity);

        DetailsInteractor interactor = new DetailsInteractor();
        interactor.presenterInput = presenter;

        if (activity.interactor == null){
            activity.interactor = interactor;
        }
        if (activity.router == null){
            activity.router = router;
        }
    }
}