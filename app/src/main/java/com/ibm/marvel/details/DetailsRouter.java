package com.ibm.marvel.details;

import android.content.Intent;
import com.ibm.marvel.comics.ComicsActivity;
import java.lang.ref.WeakReference;

interface DetailsRouterInput {
    void callScreen(long id);
}

public class DetailsRouter implements DetailsRouterInput {

    protected WeakReference<DetailsActivity> activity;

    @Override
    public void callScreen(long id) {
        activity.get().startActivity(includePutExtras(id));
    }

    private Intent includePutExtras(long id) {
        Intent intent = new Intent(activity.get(), ComicsActivity.class);
        intent.putExtra("id", id);
        return intent;
    }
}