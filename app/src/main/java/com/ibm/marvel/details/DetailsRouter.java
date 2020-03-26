package com.ibm.marvel.details;

import java.lang.ref.WeakReference;

interface DetailsRouterInput {
    void callScreen();
}

public class DetailsRouter implements DetailsRouterInput {

    protected WeakReference<DetailsActivity> activity;

    @Override
    public void callScreen() {

    }
}