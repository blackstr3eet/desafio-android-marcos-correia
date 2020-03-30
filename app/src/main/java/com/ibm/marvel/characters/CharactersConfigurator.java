package com.ibm.marvel.characters;

import java.lang.ref.WeakReference;

public enum CharactersConfigurator {
    INSTANCE;

    protected void configure(CharactersActivity activity) {

        CharactersRouter router = new CharactersRouter();
        router.activity = new WeakReference<>(activity);

        CharactersPresenter presenter = new CharactersPresenter();
        presenter.activityInput = new WeakReference<>(activity);

        CharactersInteractor interactor = new CharactersInteractor();
        interactor.presenterInput = presenter;

        if (activity.interactor == null) {
            activity.interactor = interactor;
        }
        if (activity.router == null) {
            activity.router = router;
        }
    }
}